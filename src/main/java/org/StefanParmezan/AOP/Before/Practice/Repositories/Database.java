package org.StefanParmezan.AOP.Before.Practice.Repositories;

import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface Database {
    public void saveUser(User user);
    public void removeUser(User user);
    public void editUser(User user);
    public User getUser(String username, int password);
}
