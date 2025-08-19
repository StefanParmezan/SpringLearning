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
        applicationContext.getBean(RegistrationService.class).register("StefanParmezan", 1234);
        UserService userService = applicationContext.getBean(UserService.class);
        User user = userService.getUser("StefanParmezan", 1234);
        System.out.println(user.getUsername());
    }

    public static ApplicationContext getContext(){
        return applicationContext;
    }
}
