package org.StefanParmezan.Beans_Di_Ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class TaskConfig {
    @Bean
     Task task(){
        return new Task();
    }

    @Bean
    User user(){
        return new User();
    }

    @Bean
    TaskService taskService(Task task,  User user){
        return new TaskService(task, user);
    }
}
