package org.StefanParmezan.Other.SuperHeroesGame;

import org.StefanParmezan.Other.SuperHeroesGame.Heroes.SpiderMan;
import org.StefanParmezan.Other.SuperHeroesGame.Weapons.Knife;
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
    public SpiderMan spiderMan() {
        return new SpiderMan();
    }
}
