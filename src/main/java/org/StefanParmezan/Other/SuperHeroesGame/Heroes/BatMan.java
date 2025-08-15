package org.StefanParmezan.Other.SuperHeroesGame.Heroes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.StefanParmezan.Other.SuperHeroesGame.Main;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Hero;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.Batrung;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class BatMan implements Hero {
    Weapon weapon;

    public BatMan(Batrung weapon) {
        this.weapon = weapon;
    }

    @Override
    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String getName() {
        return "BatMan";
    }

    @PostConstruct
    public void init(){
        System.out.println("Batman fly from base!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Batman run to base!");
    }
}
