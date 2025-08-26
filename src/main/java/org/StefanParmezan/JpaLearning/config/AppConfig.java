// org/StefanParmezan/JpaLearning/config/AppConfig.java
package org.StefanParmezan.JpaLearning.config;

import org.StefanParmezan.JpaLearning.models.User;
import org.StefanParmezan.JpaLearning.services.UserService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

public class AppConfig {
}