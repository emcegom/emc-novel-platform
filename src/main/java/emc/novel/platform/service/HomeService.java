package emc.novel.platform.service;

import emc.novel.platform.common.resp.RestResp;
import emc.novel.platform.dto.resp.HomeBookRespDto;

import java.util.List;

public interface HomeService {
    RestResp<List<HomeBookRespDto>> listHomeBooks();
}
