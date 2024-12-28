package emc.novel.platform.common.constant;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum SexEnum {
    MALE(0, "male"),
    FEMALE(1, "female");
    private int code;
    private String desc;
}
