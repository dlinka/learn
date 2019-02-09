package com.cr.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectAfter {

    @After("execution(* com.cr.aop.Class1.testAfter1(..))")
    public void logAfter1() {
        System.out.println("@After1 log...");
    }

    @After("execution(* com.cr.aop.Class1.testAfter2(..))")
    public void logAfter2() {
        System.out.println("@After2 log...");
    }

}
