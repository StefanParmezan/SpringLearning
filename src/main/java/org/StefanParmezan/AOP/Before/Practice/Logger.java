package org.StefanParmezan.AOP.Before.Practice;

import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
    @Before("execution(* org.StefanParmezan.AOP.Before.Practice.Services.RegistrationService.register())")
    public void logBeforeRegister() {
        System.out.println("Регистрация началась!");
    }

    @After("execution(* org.StefanParmezan.AOP.Before.Practice.Services.RegistrationService.register())")
    public void logAfterRegister() {
        System.out.println("Регистрация завершилась!");
    }
}
