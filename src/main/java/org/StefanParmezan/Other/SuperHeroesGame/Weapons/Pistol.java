package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;

public class Pistol implements Weapon {
    private int damage = 15;

    @Override
    public int getDamage() {
        return this.damage;
    }
}
