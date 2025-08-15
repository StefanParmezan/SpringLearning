package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Effect;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;

public class Knife implements Weapon {
    private int damage = 9;
    Effect effect;

    public Knife(Effect effect) {
        this.effect = effect;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public Effect getEffect() {
        return this.effect;
    }
}
