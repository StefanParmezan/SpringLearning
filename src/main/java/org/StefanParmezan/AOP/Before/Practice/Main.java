package org.StefanParmezan.AOP.Before.Practice;

import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.StefanParmezan.AOP.Before.Practice.Repositories.Database;
import org.StefanParmezan.AOP.Before.Practice.Services.RegistrationService;
import org.StefanParmezan.AOP.Before.Practice.Services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
    public static void main(String[] args) {
        RegistrationService registrationService = applicationContext.getBean(RegistrationService.class);
        UserService userService = applicationContext.getBean(UserService.class);
        registrationService.register("StefanParmezan", 12);
        User user1 = userService.getUser("StefanParmezan", 12);
        registrationService.register("Dima", 123);
        User user2 = userService.getUser("Dima", 12);
        System.out.println(user1.getUsername());
    }

    public static ApplicationContext getContext(){
        return applicationContext;
    }
}
