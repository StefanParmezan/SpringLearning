package org.StefanParmezan.AOP.Last;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class Aspects {

    @AfterReturning("execution(String org.StefanParmezan.AOP.Last.UserService.Hello(..))")
    public void afterHello(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getName() + " worked!");
    }
}
