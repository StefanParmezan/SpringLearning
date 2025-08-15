package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Effect;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;

public class Pistol implements Weapon {
    private int damage = 15;
    Effect effect;

    public Pistol(Effect effect) {
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
