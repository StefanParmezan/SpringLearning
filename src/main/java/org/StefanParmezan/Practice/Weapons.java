package org.StefanParmezan.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.StefanParmezan.Practice.Main;

import java.io.Serializable;
import java.util.function.Supplier;

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
