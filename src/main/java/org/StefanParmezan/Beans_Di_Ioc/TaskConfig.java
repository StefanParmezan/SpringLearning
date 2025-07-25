package org.StefanParmezan.Beans_Di_Ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {
    @Bean
    public Task task(){
        return new Task();
    }

    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public TaskService taskService(Task task,  User user){
        return new TaskService(task, user);
    }
}
