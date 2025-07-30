package org.StefanParmezan.ApplicationConfiguration.Practice2;

public class WaterPistol implements Gun{
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
