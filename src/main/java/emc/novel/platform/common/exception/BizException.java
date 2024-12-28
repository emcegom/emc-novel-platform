package emc.novel.platform.common.exception;

import emc.novel.platform.common.constant.RespCodeEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = true)
public class BizException extends RuntimeException {
    private final RespCodeEnum respCodeEnum;

    public BizException(RespCodeEnum respCodeEnum) {
        super(respCodeEnum.getMessage(), null, false, false);
        this.respCodeEnum = respCodeEnum;
    }

}
