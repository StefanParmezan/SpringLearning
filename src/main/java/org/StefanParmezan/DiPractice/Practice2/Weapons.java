package org.StefanParmezan.DiPractice.Practice2;

public enum Weapons {
    BAZOOKA(15),
    SWORD(10),
    HAND(0),
    ATOMICBOMB(999);

    private final Integer damage;

    Weapons(Integer damage){
        this.damage = damage;
    }

    public Integer getDamage(){
        return this.damage;
    }


    @Override
    public String toString() {
        return name() + " (урон: " + damage + ")";
    }
}
