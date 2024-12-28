package emc.novel.platform.common.resp;

import emc.novel.platform.common.constant.RespCodeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Objects;

@Getter
@AllArgsConstructor
@Builder
public class RestResp<T> {
    private String code;
    private String message;
    private T data;

    private RestResp(RespCodeEnum respCode) {
        this.code = respCode.getCode();
        this.message = respCode.getMessage();
    }

    private RestResp(RespCodeEnum respCode, T data) {
        this.code = respCode.getCode();
        this.message = respCode.getMessage();
        this.data = data;
    }


    public static RestResp<Void> ok() {
        return new RestResp<>(RespCodeEnum.OK);
    }

    public static <T> RestResp<T> ok(T data) {
        return new RestResp<>(RespCodeEnum.OK, data);
    }

    public static <T> RestResp<T> fail(RespCodeEnum respCode) {
        return new RestResp<>(respCode);
    }

    public static RestResp<Void> systemError() {
        return new RestResp<>(RespCodeEnum.SYSTEM_ERROR);
    }

    public boolean isOk() {
        return Objects.equals(this.code, RespCodeEnum.OK.getCode());
    }

}
