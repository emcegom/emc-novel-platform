package emc.novel.platform.service.impl;

import emc.novel.platform.common.resp.RestResp;
import emc.novel.platform.dto.resp.HomeBookRespDto;
import emc.novel.platform.manager.HomeBookCacheManager;
import emc.novel.platform.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HomeServiceImpl implements HomeService {

    private final HomeBookCacheManager homeBookCacheManager;

    @Override
    public RestResp<List<HomeBookRespDto>> listHomeBooks() {
        return RestResp.ok(homeBookCacheManager.listHomeBooks());
    }
}
