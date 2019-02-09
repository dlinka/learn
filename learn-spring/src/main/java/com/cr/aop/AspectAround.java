package com.cr.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectAround {

    @Around("execution(* com.cr.aop.Class1.testAround1(..))")
    public void logAround1(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("@Around log1...");
        jp.proceed();
        System.out.println("@Around log2...");
    }

    @Around("execution(* com.cr.aop.Class1.testAround2(..))")
    public void logAround2(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("@Around log1...");
        jp.proceed();
        System.out.println("@Around log2...");
    }

    @Around("execution(* com.cr.aop.Class1.testAround3(..))")
    public int logAround3(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("@Around log1...");
        int i = (int) jp.proceed();
        System.out.println("i - " + i);
        System.out.println("@Around log2...");
        return 1024;  //返回值改变
    }

}
