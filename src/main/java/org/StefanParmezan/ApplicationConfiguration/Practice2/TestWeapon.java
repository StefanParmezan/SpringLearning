package org.StefanParmezan.ApplicationConfiguration.Practice2;

import org.springframework.stereotype.Component;

@Component
public class TestWeapon implements Weapon{
    int damage = 0;
    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public int getDamage() {
        return this.damage;
    }
}
