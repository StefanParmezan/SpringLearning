package org.StefanParmezan.Scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class UserService {
    public void sayHello(User user) {
        System.out.println("Hello from " + user.getName());
    }
}
