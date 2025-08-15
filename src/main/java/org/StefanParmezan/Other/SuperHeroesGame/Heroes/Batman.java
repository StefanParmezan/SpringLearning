package org.StefanParmezan.Other.SuperHeroesGame.Heroes;

import org.StefanParmezan.Other.SuperHeroesGame.Main;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Hero;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.Batrung;

public class Batman implements Hero {

    Weapon weapon =  Main.getContext().getBean(Batrung.class);

    @Override
    public Weapon getWeapon() {
        return this.weapon;
    }

    @Override
    public String getName() {
        return "Batman";
    }
}
