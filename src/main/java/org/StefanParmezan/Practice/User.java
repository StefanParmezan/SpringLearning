package org.StefanParmezan.Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
@Scope("prototype")
class User {
    private String name;
    private Weapons weapon;

    @Autowired
    public User(String name, Weapons weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
