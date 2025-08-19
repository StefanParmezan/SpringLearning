package org.StefanParmezan.AOP.Before.Practice;

import org.StefanParmezan.AOP.Before.Practice.Data.MySQL;
import org.StefanParmezan.AOP.Before.Practice.Data.PostgreSQL;
import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.StefanParmezan.AOP.Before.Practice.Repositories.Database;
import org.StefanParmezan.AOP.Before.Practice.Services.RegistrationService;
import org.StefanParmezan.AOP.Before.Practice.Services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public UserService userService(PostgreSQL postgreSQL) {
        return new UserService(postgreSQL);
    }

    @Bean
    public MySQL mySQL() {
        return new MySQL();
    }

    @Bean
    public PostgreSQL postgreSQL() {
        return new PostgreSQL();
    }

    @Bean
    public RegistrationService registrationService() {
        return new RegistrationService();
    }
}
