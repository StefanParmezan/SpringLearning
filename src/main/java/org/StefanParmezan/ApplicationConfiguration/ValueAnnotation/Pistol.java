package org.StefanParmezan.ApplicationConfiguration.ValueAnnotation;

import org.springframework.stereotype.Component;

@Component
class Pistol implements Weapon {
    int damage = 5;

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "Pistol{" +
                "damage=" + damage +
                '}';
    }
}
