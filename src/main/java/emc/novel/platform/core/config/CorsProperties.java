package emc.novel.platform.core.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "novel.cors")
public class CorsProperties {
    private List<String> allowOrigins;
}
