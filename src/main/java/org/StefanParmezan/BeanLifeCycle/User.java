package org.StefanParmezan.BeanLifeCycle;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
    private final String name;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @PostConstruct
    public void init(){
        System.out.println("User init");
    }
}
