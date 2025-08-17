package org.StefanParmezan.AOP.Before;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    public void doWork() {
        System.out.println("doWork");
    }

    public SomeService() {
        System.out.println("SomeService");
    }
}
