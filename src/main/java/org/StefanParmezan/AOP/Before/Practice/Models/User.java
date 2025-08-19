package org.StefanParmezan.AOP.Before.Practice.Models;

import org.StefanParmezan.AOP.Before.Practice.Repositories.Database;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class User {
    private String username;
    private int password;


    public User(String username, int password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
