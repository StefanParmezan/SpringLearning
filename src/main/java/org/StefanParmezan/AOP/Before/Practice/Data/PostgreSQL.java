package org.StefanParmezan.AOP.Before.Practice.Data;

import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.StefanParmezan.AOP.Before.Practice.Repositories.Database;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Repository
public class PostgreSQL implements Database {
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
    public User getUser(User user) {
        return users.get(user.getUsername());
    }
}
