package org.StefanParmezan.Scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class HelloService {
    public void sayHello(String name) {
        System.out.println("Hello from " + name);
    }
}
