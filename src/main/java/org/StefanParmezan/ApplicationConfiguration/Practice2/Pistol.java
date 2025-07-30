package org.StefanParmezan.ApplicationConfiguration.Practice2;

import org.springframework.stereotype.Component;

@Component
class Pistol implements Gun{
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
