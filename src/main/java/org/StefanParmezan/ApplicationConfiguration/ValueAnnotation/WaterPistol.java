package org.StefanParmezan.ApplicationConfiguration.ValueAnnotation;

public class WaterPistol implements Weapon {
    int damage = 1;

    public WaterPistol(){}

    public int getDamage(){
        return damage;
    }

    @Override
    public String toString() {
        return "WaterPistol{" +
                "damage=" + damage +
                '}';
    }
}
