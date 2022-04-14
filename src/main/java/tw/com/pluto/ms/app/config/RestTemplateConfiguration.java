package tw.com.pluto.ms.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
