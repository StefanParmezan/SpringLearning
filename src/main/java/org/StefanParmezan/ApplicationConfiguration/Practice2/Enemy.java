package org.StefanParmezan.ApplicationConfiguration.Practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Enemy {
    Gun gun;

    @Autowired
    public Enemy(Gun gun){
        this.gun = gun;
    }

    public Gun getGun(){
        return this.gun;
    }
}
