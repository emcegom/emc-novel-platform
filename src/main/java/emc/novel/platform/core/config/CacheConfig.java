package emc.novel.platform.core.config;

import com.github.benmanes.caffeine.cache.Caffeine;
import emc.novel.platform.common.constant.CacheConst;
import emc.novel.platform.common.constant.CacheEnum;
import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConfiguration;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

@Configuration
public class CacheConfig {
    @Bean
    @Primary
    public CacheManager caffeineCacheManager() {
        SimpleCacheManager cacheManager = new SimpleCacheManager();
        List<CaffeineCache> caches = new ArrayList<>(CacheEnum.values().length);
        Arrays.stream(CacheEnum.values())
                .filter(CacheEnum::isLocalCache)
                .forEach(c -> {
                    Caffeine<Object, Object> caffeine = Caffeine.newBuilder().recordStats().maximumSize(c.getMaxSize());
                    if (c.getTtl() > 0) caffeine.expireAfterWrite(Duration.ofSeconds(c.getTtl()));
                    caches.add(new CaffeineCache(c.getName(), caffeine.build()));
                });
        cacheManager.setCaches(caches);
        return cacheManager;
    }

    @Bean
    public CacheManager redisCacheManager(RedisConnectionFactory connectionFactory) {
        RedisCacheWriter redisCacheWriter = RedisCacheWriter.nonLockingRedisCacheWriter(connectionFactory);

        RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig()
                .disableCachingNullValues()
                .prefixCacheNameWith(CacheConst.REDIS_CACHE_PREFIX);

        LinkedHashMap<String, RedisCacheConfiguration> cacheMap = new LinkedHashMap<>(CacheEnum.values().length);
        Arrays.stream(CacheEnum.values())
                .filter(CacheEnum::isRemoteCache)
                .forEach(c -> {
                    RedisCacheConfiguration cacheConfiguration = RedisCacheConfiguration.defaultCacheConfig()
                            .disableCachingNullValues()
                            .prefixCacheNameWith(CacheConst.REDIS_CACHE_PREFIX);
                    if (c.getTtl() > 0) cacheConfiguration.entryTtl(Duration.ofSeconds(c.getTtl()));
                    cacheMap.put(c.getName(), cacheConfiguration);
                });
        RedisCacheManager redisCacheManager = new RedisCacheManager(redisCacheWriter, defaultCacheConfig, cacheMap);
        redisCacheManager.setTransactionAware(true);
        redisCacheManager.initializeCaches();
        return redisCacheManager;
    }
}
