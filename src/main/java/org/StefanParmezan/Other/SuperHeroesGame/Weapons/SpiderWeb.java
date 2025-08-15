package org.StefanParmezan.Other.SuperHeroesGame.Weapons;

import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Effect;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;;

public class SpiderWeb implements Weapon, Effect {
    private int damage = 10;

    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public String getEffect() {
        return "SpiderWeb debuff you slowness!";
    }
}
