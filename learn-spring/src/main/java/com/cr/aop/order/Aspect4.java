package com.cr.aop.order;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Aspect4 {

    @Around("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log3(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Aspect4 Around start log3...");
        jp.proceed();
        System.out.println("Aspect4 Around end log3...");
    }

    @Around("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log1(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Aspect4 Around start log1...");
        jp.proceed();
        System.out.println("Aspect4 Around end log1...");
    }

    @Around("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log2(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Aspect4 Around start log2...");
        jp.proceed();
        System.out.println("Aspect4 Around end log2...");
    }
}
