package com.cr.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectOrder1 {

    @Before("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logBefore3() {
        System.out.println(1 + " aop before3...");
    }

    @Before("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logBefore1() {
        System.out.println(1 + " aop before1...");
    }

    @Before("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logBefore2() {
        System.out.println(1 + " aop before2...");
    }

}
