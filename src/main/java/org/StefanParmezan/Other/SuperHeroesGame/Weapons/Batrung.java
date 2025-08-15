package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Effect;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;

public class Batrung implements Weapon, Effect {
    private int damage = 12;

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public String getEffect() {
        return "Batrung debuff you BOOM!";
    }
}
