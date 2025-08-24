package org.StefanParmezan.AOP.Last;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy()
@Configuration
@Component
@ComponentScan("org.StefanParmezan.AOP.Last")
public class AppConfig {
    @Bean
    public UserService userService(){
        return new UserService();
    }


    @Bean
    @Scope("prototype")
    public User user(String name){
        return new User(name);
    }
}
