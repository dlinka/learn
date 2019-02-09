package com.cr.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AspectBefore {

    @Before("execution(* com.cr.aop.Class1.testBefore(..))")
    public void logBefore() {
        System.out.println("@Before log...");
    }

}
