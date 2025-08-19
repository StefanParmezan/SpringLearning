package org.StefanParmezan.AOP.Before.Other;

import org.springframework.stereotype.Service;

@Service
public class SomeService {

    public void doWork() {
        System.out.println("doWork");
    }

    public SomeService() {
    }
}
