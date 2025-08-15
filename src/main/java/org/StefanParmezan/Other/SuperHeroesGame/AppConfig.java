package org.StefanParmezan.Other.SuperHeroesGame;

import org.StefanParmezan.Other.SuperHeroesGame.Effects.Boom;
import org.StefanParmezan.Other.SuperHeroesGame.Effects.Null;
import org.StefanParmezan.Other.SuperHeroesGame.Effects.Slowness;
import org.StefanParmezan.Other.SuperHeroesGame.Heroes.BatMan;
import org.StefanParmezan.Other.SuperHeroesGame.Heroes.DeadPool;
import org.StefanParmezan.Other.SuperHeroesGame.Heroes.SpiderMan;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.Batrung;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.Knife;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.Pistol;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.SpiderWeb;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public SpiderMan spiderMan() {
        return new SpiderMan(new SpiderWeb(new Slowness()));
    }

    @Bean
    public BatMan batman() {
        return new BatMan(new Batrung(new Boom()));
    }

    @Bean
    public DeadPool deadPool() {
        return new DeadPool(new Pistol(new Null()), new Knife(new Null()));
    }
}
