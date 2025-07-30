package org.StefanParmezan.ApplicationConfiguration.Practice2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Enemy enemy = context.getBean(Enemy.class);
        System.out.println(enemy.getGun());
    }
}
