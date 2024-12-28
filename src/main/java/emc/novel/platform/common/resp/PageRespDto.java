package emc.novel.platform.common.resp;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
@Builder
public class PageRespDto<T> {
    private final long pageNum;
    private final long pageSize;
    private final long total;
    private final List<? extends T> list;

    public long getTotalPage() {
        if (this.pageSize == 0L) {
            return 0L;
        }
        long pages = this.total / this.pageSize;
        return this.total % this.pageSize == 0L ? pages : pages + 1;
    }

}
