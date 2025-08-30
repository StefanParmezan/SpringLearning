// org/StefanParmezan/JpaLearning/Main.java
package org.StefanParmezan.JpaLearning;

import org.StefanParmezan.JpaLearning.services.JpaService;
import org.StefanParmezan.JpaLearning.services.JpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;

@SpringBootApplication
public class Main {
    @Autowired
    private static JpaService jpaService;
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        ApplicationContext context = SpringApplication.run(Main.class, args);
        JpaService jpaService = context.getBean(JpaService.class);
        jpaService.createUser("StefanParmezan", "1234");
        System.out.println(jpaService.getAllUsers().toString());
    }
}