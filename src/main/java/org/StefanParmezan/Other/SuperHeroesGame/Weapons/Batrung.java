package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;

public class Batrung implements Weapon {
    private int damage = 12;

    @Override
    public int getDamage() {
        return this.damage;
    }
}
