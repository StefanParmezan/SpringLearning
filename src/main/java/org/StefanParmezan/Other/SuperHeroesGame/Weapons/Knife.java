package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;

public class Knife implements Weapon {
    private int damage = 9;
    @Override
    public int getDamage() {
        return this.damage;
    }
}
