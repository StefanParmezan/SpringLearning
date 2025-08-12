package org.StefanParmezan.Other.SuperHeroesGame;

import org.StefanParmezan.Other.SuperHeroesGame.Heroes.SpiderMan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context.getBean(SpiderMan.class).getName());
    }
}
