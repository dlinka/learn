package com.cr.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class AspectUseOrder2 {

    @Before("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logBefore1() {
        System.out.println(2 + " aop before1...");
    }

    @Around("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logAround1(ProceedingJoinPoint jp) throws Throwable {
        System.out.println(2 + " aop around1...");
        jp.proceed();
        System.out.println(2 + " aop around1...");
    }

    @After("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logAfter1() {
        System.out.println(2 + " aop after1...");
    }

}
