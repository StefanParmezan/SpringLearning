package org.StefanParmezan.AOP.Before.Other;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

    @Before("execution(void org.StefanParmezan.AOP.Before.Other.SomeService.doWork())")
    public void logBeforeDoWork() {
        System.out.println("Метод doWork начался!");
    }

    @After("execution(void org.StefanParmezan.AOP.Before.Other.SomeService.doWork())")
    public void logAfterDoWork() {
        System.out.println("Метод doWork закончился!");
    }
}