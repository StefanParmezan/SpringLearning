package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Effect;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;;

public class SpiderWeb implements Weapon {
    private int damage = 10;
    private Effect effect;

    public SpiderWeb(Effect effect) {
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
