package org.StefanParmezan.AOP.Before.Practice.Services;

import org.StefanParmezan.AOP.Before.Practice.Repositories.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private Database database;

    @Autowired
    public UserService(Database database) {
        this.database = database;
    }


}
