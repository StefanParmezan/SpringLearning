package org.StefanParmezan.Other.SuperHeroesGame.Heroes;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Hero;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.SpiderWeb;

public class SpiderMan implements Hero {

    Weapon weapon = new SpiderWeb();

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public String getName() {
        return "SpiderMan";
    }
}
