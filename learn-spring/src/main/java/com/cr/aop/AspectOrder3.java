package com.cr.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectOrder3 {

    @After("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logAfter3() {
        System.out.println(3 + " aop after3...");
    }

    @After("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logAfter1() {
        System.out.println(3 + " aop after1...");
    }

    @After("execution(* com.cr.aop.Order1.testOrder(..))")
    public void logAfter2() throws Throwable {
        System.out.println(3 + " aop after2...");
    }

}
