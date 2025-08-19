package org.StefanParmezan.AOP.Before.Practice.Services;

import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.StefanParmezan.AOP.Before.Practice.Repositories.Database;
import org.aspectj.lang.annotation.After;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Database database;

    @Autowired
    public UserService(Database database) {
        this.database = database;
    }

    public void save(User user){
        database.saveUser(user);
    }

    public User getUser(String username, int password){
        return database.getUser(username, password);
    }
}
