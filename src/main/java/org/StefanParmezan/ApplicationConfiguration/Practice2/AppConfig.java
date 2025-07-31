package org.StefanParmezan.ApplicationConfiguration.Practice2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@PropertySource("classpath:application.properties")
@Configuration
class AppConfig {
    @Value("${game.difficulty}")
    private String difficulty;


    @Bean
    @Profile("prod")
    public Enemy enemy() throws Exception {
        return switch (difficulty.toLowerCase()) {
            case "easy" -> new Enemy(new WaterPistol());
            case "normal" -> new Enemy(new Pistol());
            case "hard" -> new Enemy(new Minigun());
            default -> throw new Exception("Invalid difficulty!");
        };
    }

    @Bean
    @Profile("dev")
    public TestEnemy test() {
        return new TestEnemy(new TestWeapon());
    }

}
