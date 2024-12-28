package emc.novel.platform.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum CacheEnum {
    HOME_BOOK_CACHE(1, "homeBookCache", 0, 1),
    HOME_FRIEND_LINK_CACHE(2, "homeFriendLinkCache", 1000, 1);
    private int type;
    private String name;
    private int ttl;
    private int maxSize;
}
