package emc.novel.platform.manager;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import emc.novel.platform.common.constant.CacheConst;
import emc.novel.platform.dao.entity.BookInfo;
import emc.novel.platform.dao.entity.HomeBook;
import emc.novel.platform.dao.mapper.BookInfoMapper;
import emc.novel.platform.dao.mapper.HomeBookMapper;
import emc.novel.platform.dto.resp.HomeBookRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class HomeBookCacheManager {
    private final HomeBookMapper homeBookMapper;
    private final BookInfoMapper bookInfoMapper;

    @Cacheable(cacheManager = CacheConst.CAFFEINE_CACHE_MANAGER,
            value = CacheConst.HOME_BOOK_CACHE_NAME)
    public List<HomeBookRespDto> listHomeBooks() {
        List<HomeBook> homeBooks = homeBookMapper.selectList(null);
        if (CollectionUtils.isEmpty(homeBooks)) return Collections.emptyList();

        List<Long> bookIds = homeBooks.stream().map(HomeBook::getBookId).toList();

        LambdaQueryWrapper<BookInfo> bookInfoQuery = new LambdaQueryWrapper<>();
        bookInfoQuery.in(BookInfo::getId, bookIds);
        List<BookInfo> bookInfos = bookInfoMapper.selectList(bookInfoQuery);

        if (CollectionUtils.isEmpty(bookInfos)) return Collections.emptyList();

        Map<Long, BookInfo> bookInfoMap = bookInfos.stream().collect(Collectors.toMap(BookInfo::getId, Function.identity()));

        return homeBooks.stream().map( b -> {
            BookInfo bookInfo = bookInfoMap.get(b.getBookId());
            return HomeBookRespDto.builder()
                    .bookId(b.getBookId())
                    .bookName(bookInfo.getBookName())
                    .bookDesc(bookInfo.getBookDesc())
                    .authorName(bookInfo.getAuthorName())
                    .picUrl(bookInfo.getPicUrl())
                    .build();
        }).toList();
    }

}
