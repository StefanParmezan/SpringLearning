package org.StefanParmezan.AOP.Before.Practice.Data;

import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.StefanParmezan.AOP.Before.Practice.Repositories.Database;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Repository
public class MySQL implements Database {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void saveUser(User user) {
        users.put(user.getUsername(), user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user.getUsername());
    }

    @Override
    public void editUser(User user) {
        users.put(user.getUsername(), user);
    }

    @Override
    public User getUser(String username, int password) {
        if(users.get(username).getPassword() == password){
            return users.get(username);
        }

        else{
            throw new RuntimeException("Wrong password");
        }
    }
}
