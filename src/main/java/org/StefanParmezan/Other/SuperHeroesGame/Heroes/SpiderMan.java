package org.StefanParmezan.Other.SuperHeroesGame.Heroes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.StefanParmezan.Other.SuperHeroesGame.Main;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Hero;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.SpiderWeb;

public class SpiderMan implements Hero {

    Weapon weapon;

    public SpiderMan(SpiderWeb weapon) {
        this.weapon = weapon;
    }

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public String getName() {
        return "SpiderMan";
    }

    @PostConstruct
    public void init(){
        System.out.println("Strange spider bites Peter Parker!");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Peter Parker took off his suit!");
    }
}
