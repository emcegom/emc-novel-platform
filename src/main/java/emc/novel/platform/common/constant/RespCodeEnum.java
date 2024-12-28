package emc.novel.platform.common.constant;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum RespCodeEnum {
    OK("00000", "OK"),
    USER_ERROR("A0001", "user error"),
    USER_REGISTER_ERROR("A0100", "user register error"),
    USER_NO_AGREE_PRIVATE_ERROR("A0101", "user no agree private error"),
    USER_REGISTER_AREA_LIMIT_ERROR("A0102", "user register area limit"),
    USER_REQUEST_PARAM_ERROR("A0400", "user request param error"),
    SYSTEM_ERROR("B0001", "system error"),
    SYSTEM_TIMEOUT_ERROR("B0100", "system timeout error"),
    THIRD_SERVICE_ERROR("C0001", "third service error"),
    MIDDLEWARE_SERVICE_ERROR("C0100", "middleware service error");
    private String code;
    private String message;
}
