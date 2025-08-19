package org.StefanParmezan.AOP.Before.Other;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        SomeService service = context.getBean(SomeService.class);
        service.doWork();
    }
}
