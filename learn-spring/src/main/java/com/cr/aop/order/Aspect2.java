package com.cr.aop.order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect2 {

    @Before("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void logBefore() {
        System.out.println("Aspect2 Before log...");
    }

    @Around("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void logAround(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Aspect2 Around start log...");
        jp.proceed();
        System.out.println("Aspect2 Around end log...");
    }

    @After("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void logAfter() {
        System.out.println("Aspect2 After log...");
    }

}
