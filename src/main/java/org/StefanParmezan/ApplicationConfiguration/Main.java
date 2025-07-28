package org.StefanParmezan.ApplicationConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        Entity entity = context.getBean(Entity.class, "Dima");
        System.out.println(entity.getName());
    }
}
