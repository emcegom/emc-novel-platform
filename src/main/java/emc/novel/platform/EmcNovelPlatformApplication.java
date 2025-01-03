package emc.novel.platform;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@Slf4j
@EnableCaching
public class EmcNovelPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmcNovelPlatformApplication.class, args);
    }

}
