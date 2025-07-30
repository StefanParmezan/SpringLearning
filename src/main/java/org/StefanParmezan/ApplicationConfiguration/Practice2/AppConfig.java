package org.StefanParmezan.ApplicationConfiguration.Practice2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:application.properties")
@Configuration
class AppConfig {
    @Value("${game.difficulty}")
    private String difficulty;


    @Bean
    public Enemy enemy(){
        return switch (difficulty.toLowerCase()) {
            case "easy" -> new Enemy(new WaterPistol());
            case "normal" -> new Enemy(new Pistol());
            case "hard" -> new Enemy(new Minigun());
            default ->null;
        };
    }

}
