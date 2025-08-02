package org.StefanParmezan.Scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
    @Bean
    public UserService userService() {
        return new UserService();
    }

    @Bean
    @Scope("prototype")
    public User userPrototype(String name) {
       return new User(name);
    }
}
