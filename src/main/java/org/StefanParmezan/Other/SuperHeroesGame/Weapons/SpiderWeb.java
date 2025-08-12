package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;;

public class SpiderWeb implements Weapon {
    private int damage = 10;


    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public Weapon getWeapon() {
        return null;
    }


}
