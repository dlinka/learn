package com.cr.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectOrder4 {

    @Around("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logAround3(ProceedingJoinPoint jp) throws Throwable {
        System.out.println(4 + " aop around3...");
        jp.proceed();
        System.out.println(4 + " aop around3...");
    }

    @Around("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logAround1(ProceedingJoinPoint jp) throws Throwable {
        System.out.println(4 + " aop around1...");
        jp.proceed();
        System.out.println(4 + " aop around1...");

    }

    @Around("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logAround2(ProceedingJoinPoint jp) throws Throwable {
        System.out.println(4 + " aop around2...");
        jp.proceed();
        System.out.println(4 + " aop around2...");

    }
}
