package com.felixwc.springframework.aop.start.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class StartAspect {
    @Pointcut("execution(* com.felixwc.springframework.aop.start.service..*.*(..))")
    public void logPointcut(){
    }

    @Before(value = "logPointcut()")
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }

    @After(value = "logPointcut()")
    public void AfterMethod(){
        System.out.println("AfterMethod");
    }

    @AfterReturning(value = "logPointcut()")
    public void afterReturningMethod(){
        System.out.println("afterReturningMethod");
    }
    @AfterThrowing(value = "logPointcut()")
    public void afterThrowingMethod(){
        System.out.println("afterThrowingMethod");
    }

    @Around(value = "logPointcut()")
    public void aroundMethod(ProceedingJoinPoint joinPoint){
        System.out.println("Around method before");
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("Around method after");
    }
}
