package emc.novel.platform.common.exception;

import emc.novel.platform.common.constant.RespCodeEnum;
import emc.novel.platform.common.resp.RestResp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@Slf4j
@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(BindException.class)
    public RestResp<Void> handlerBindException(BindException e) {
        log.error(e.getMessage(), e);
        return RestResp.fail(RespCodeEnum.USER_REQUEST_PARAM_ERROR);
    }

    @ExceptionHandler(BizException.class)
    public RestResp<Void> handlerBizException(BizException e) {
        log.error(e.getMessage(), e);
        return RestResp.fail(e.getRespCodeEnum());
    }

    @ExceptionHandler(Exception.class)
    public RestResp<Void> handlerException(Exception e) {
        log.error(e.getMessage(), e);
        return RestResp.systemError();
    }
}
