package emc.novel.platform.common.req;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class PageReqDto {
    private int pageNum = 1;
    private int pageSize = 10;
    private boolean fetchAll = false;
}
