package org.StefanParmezan.AOP.Before.Practice.Services;

import org.StefanParmezan.AOP.Before.Practice.Main;
import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.StefanParmezan.AOP.Before.Practice.Repositories.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {
    public void register(String username, int password) throws RuntimeException{
        User user = new User(username, password);
        try {
            Main.getContext().getBean(UserService.class).save(user);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
