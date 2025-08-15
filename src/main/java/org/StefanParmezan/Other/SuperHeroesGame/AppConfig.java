package org.StefanParmezan.Other.SuperHeroesGame;

import org.StefanParmezan.Other.SuperHeroesGame.Heroes.Batman;
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
    public SpiderWeb spiderWeb() {
        return new SpiderWeb();
    }

    @Bean
    public Knife knife() {
        return new Knife();
    }

    @Bean
    public Pistol pistol(){
        return new Pistol();
    }

    @Bean
    public SpiderMan spiderMan() {
        return new SpiderMan();
    }

    @Bean
    public Batrung batrung() {
        return new Batrung();
    }

    @Bean
    public Batman batman() {
        return new Batman();
    }
}
