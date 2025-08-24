package org.StefanParmezan.AOP.Last;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String Hello(User user1, User user2){
        return user1.getName() + " сказал привет " + user2.getName();
    }
}
