package com.cr.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class AspectUseOrder1 {

    @Before("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logBefore3() {
        System.out.println(1 + " aop before3...");
    }

    @Before("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logBefore1() {
        System.out.println(1 + " aop before1...");
    }

    @Before("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logBefore2() {
        System.out.println(1 + " aop before2...");
    }

}
