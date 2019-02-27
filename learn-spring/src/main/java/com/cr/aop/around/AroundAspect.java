package com.cr.aop.around;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AroundAspect {

    @Around("execution(* com.cr.aop.around.AroundBean.test1(..))")
    public void log1(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("start log...");
        jp.proceed();
        System.out.println("end log...");
    }

    @Around("execution(* com.cr.aop.around.AroundBean.test2(..))")
    public void log2(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("start log...");
        jp.proceed();
        System.out.println("end log...");
    }

    @Around("execution(* com.cr.aop.around.AroundBean.test3(..))")
    public int log3(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("start log...");
        int i = (int) jp.proceed();
        System.out.println("i - " + i);
        i = 1024;
        System.out.println("end log...");
        return i;
    }

}
