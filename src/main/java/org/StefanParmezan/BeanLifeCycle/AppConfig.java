package org.StefanParmezan.BeanLifeCycle;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("org.StefanParmezan.BeanLifeCycle")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public User user (String name) {
        return new User(name);
    }
}
