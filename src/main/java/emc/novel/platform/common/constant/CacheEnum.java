package emc.novel.platform.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum CacheEnum {
    HOME_BOOK_CACHE(CacheConst.CACHE_TYPE_LOCAL_AND_REMOTE, "homeBookCache", 0, 1),
    HOME_FRIEND_LINK_CACHE(CacheConst.CACHE_TYPE_REMOTE, "homeFriendLinkCache", 1000, 1);
    private int type;
    private String name;
    private int ttl;
    private int maxSize;

    public boolean isLocalCache() {
        return type == CacheConst.CACHE_TYPE_LOCAL || type == CacheConst.CACHE_TYPE_LOCAL_AND_REMOTE;
    }

    public boolean isRemoteCache() {
        return type == CacheConst.CACHE_TYPE_REMOTE || type == CacheConst.CACHE_TYPE_LOCAL_AND_REMOTE;
    }
}
