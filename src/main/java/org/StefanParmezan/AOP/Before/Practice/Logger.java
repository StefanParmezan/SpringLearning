package org.StefanParmezan.AOP.Before.Practice;

import org.StefanParmezan.AOP.Before.Practice.Models.User;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {
    @Before("execution(void org.StefanParmezan.AOP.Before.Practice.Services.RegistrationService.register(String, int))")
    public void logBeforeRegister() {
        System.out.println("Регистрация началась!");
    }

    @AfterThrowing("execution(void org.StefanParmezan.AOP.Before.Practice.Services.RegistrationService.register(String, int))")
    public void failRegister() {
        System.out.println("Регистрация не удалась!");
    }

    @AfterReturning("execution(void org.StefanParmezan.AOP.Before.Practice.Services.RegistrationService.register(String, int))")
    public void successRegister() {
        System.out.println("Регистрация завершилась успешно!");
    }

}
