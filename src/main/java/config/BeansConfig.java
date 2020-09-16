package config;

import entity.ZhengKang;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ZhengKang zhengKang(){
        return new ZhengKang();
    }
}
