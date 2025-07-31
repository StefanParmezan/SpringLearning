package org.StefanParmezan.ApplicationConfiguration.Practice2;

import org.springframework.stereotype.Component;

@Component
class Minigun implements Weapon {
    int damage = 10;

    public int getDamage() {
        return damage;
    };

    @Override
    public String toString() {
        return "Minigun{" +
                "damage=" + damage +
                '}';
    }
}
