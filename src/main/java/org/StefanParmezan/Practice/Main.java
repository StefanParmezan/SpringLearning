package org.StefanParmezan.Practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.ObjectInputFilter;

class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("org.StefanParmezan.Practice");
        WeaponService weaponService = context.getBean(WeaponService.class);
        User u1 = context.getBean(User.class, "Misha", Weapons.ATOMICBOMB);
        User u2 = context.getBean(User.class, "Artem", Weapons.BAZOOKA);
        weaponService.damage(u1, u2);
        ZoneService zoneService = context.getBean(ZoneService.class);
        zoneService.setPvpZone(u1);
        System.out.println(u1.getName() + " " + u1.getWeapon());
        zoneService.setPveZone(u1);
        System.out.println(u1.getName() + " " + u1.getWeapon());
        zoneService.setPvpZone(u1);
        System.out.println(u1.getName() + " " + u1.getWeapon());
    }
}
