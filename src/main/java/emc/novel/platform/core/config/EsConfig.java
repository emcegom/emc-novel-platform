package emc.novel.platform.core.config;

import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EsConfig {
    @Bean
    public JacksonJsonpMapper jacksonJsonpMapper(){
        return new JacksonJsonpMapper();
    }
}
