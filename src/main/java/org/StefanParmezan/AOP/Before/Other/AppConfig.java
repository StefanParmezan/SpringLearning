package org.StefanParmezan.AOP.Before.Other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan("org.StefanParmezan.AOP.Before")
public class AppConfig {
    @Bean
    SomeService someService() {
        return new SomeService();
    }

    @Bean
    Logger logger() {
        return new Logger();
    }
}
