package org.StefanParmezan.ApplicationConfiguration.ValueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Enemy enemy = context.getBean(Enemy.class);
        System.out.println(enemy);
        TestEnemy testEnemy = context.getBean(TestEnemy.class);
        System.out.println(testEnemy);
    }
}
