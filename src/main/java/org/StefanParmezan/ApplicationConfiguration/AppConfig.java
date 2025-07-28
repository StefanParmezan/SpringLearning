package org.StefanParmezan.ApplicationConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.StefanParmezan.ApplicationConfiguration")
public class AppConfig {

    @Bean
    public Entity entity() {
        return new Entity("Entity");
    }
}
