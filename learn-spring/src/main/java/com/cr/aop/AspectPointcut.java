package com.cr.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectPointcut {

    @Pointcut("execution(* testPointcut*(..))")
    public void logPointcut() {
    }

    @Before(value = "logPointcut()")
    public void logBefore1() {
        System.out.println("log before1...");
    }

    @Before(value = "logPointcut()" + "&& args(person)")
    public void logBefore2(Person person) {
        System.out.println("log before2...");
    }

}
