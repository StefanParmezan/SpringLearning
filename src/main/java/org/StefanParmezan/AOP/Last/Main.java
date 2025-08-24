package org.StefanParmezan.AOP.Last;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User anton = context.getBean(User.class, "anton");
        User dima = context.getBean(User.class, "dima");
        UserService userService = (UserService) context.getBean("userService");
        userService.Hello(anton, dima);
    }
}
