package org.StefanParmezan.Other.SuperHeroesGame.Heroes;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.StefanParmezan.Other.SuperHeroesGame.Main;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Hero;
import org.StefanParmezan.Other.SuperHeroesGame.Repositories.Weapon;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.Knife;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.Pistol;

public class DeadPool implements Hero {
    Weapon weapon1 = Main.getContext().getBean(Knife.class);
    Weapon weapon2 = Main.getContext().getBean(Pistol.class);

    @Override
    public Weapon getWeapon() {
        return this.weapon1;
    }

    public Weapon getWeapon2() {
        return this.weapon2;
    }

    @Override
    public String getName() {
        return "DeadPool";
    }

    @PostConstruct
    public void init() {
        System.out.println("DeadPool pulled on the mask!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("DeadPool went for regeneration!");
    }
}
