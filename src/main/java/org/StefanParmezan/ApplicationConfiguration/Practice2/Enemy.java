package org.StefanParmezan.ApplicationConfiguration.Practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Enemy {
    Weapon weapon;

    @Autowired
    public Enemy(Weapon weapon){
        this.weapon = weapon;
    }

    public Weapon getWeapon(){
        return this.weapon;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "weapon=" + weapon +
                '}';
    }
}
