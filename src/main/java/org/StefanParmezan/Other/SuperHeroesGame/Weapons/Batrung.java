package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Effect;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;

public class Batrung implements Weapon {
    private int damage = 12;
    private Effect effect;
    public Batrung(Effect effect) {
        this.effect = effect;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    public Effect getEffect() {
        return this.effect;
    }
}
