package emc.novel.platform.common.constant;

public interface CacheConst {
    String REDIS_CACHE_PREFIX = "Cache::Novel::";
    String CAFFEINE_CACHE_MANAGER = "caffeineCacheManager";
    String REDIS_CACHE_MANAGER = "redisCacheManager";
    String HOME_BOOK_CACHE_NAME = "homeBookCache";
    String HOME_FRIEND_LINK_CACHE_NAME = "homeFriendLinkCache";
    int CACHE_TYPE_LOCAL = 0;
    int CACHE_TYPE_LOCAL_AND_REMOTE = 1;
    int CACHE_TYPE_REMOTE = 2;

}
