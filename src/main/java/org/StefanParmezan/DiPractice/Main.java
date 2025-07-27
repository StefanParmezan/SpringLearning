package org.StefanParmezan.DiPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.StefanParmezan.DiPractice");
        Car car = context.getBean(Lada.class, "В595ОВ", 90, 500000);
        Driver driver = context.getBean(Driver.class, car);
        driver.getCar().Drive();
        Car car2  = context.getBean(Toyota.class, "Р908ОК", 100, 700000);
        Driver driver2 = context.getBean(Driver.class, car2);
        driver2.getCar().Drive();
    }
}
