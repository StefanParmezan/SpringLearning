package org.StefanParmezan.Scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        User user = context.getBean(User.class, "Dima");
        userService.sayHello(user);
        User user2 = context.getBean(User.class, "Anton");
        userService.sayHello(user2);
        UserService userService2 = context.getBean(UserService.class);
        System.out.println(user == user2);
        System.out.println(userService2 == userService);
    }
}
