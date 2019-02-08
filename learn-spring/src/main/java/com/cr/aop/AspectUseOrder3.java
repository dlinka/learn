package com.cr.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(3)
public class AspectUseOrder3 {

    @After("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logAfter3() {
        System.out.println(3 + " aop after3...");
    }

    @After("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logAfter1() {
        System.out.println(3 + " aop after1...");
    }

    @After("execution(* com.cr.aop.UseOrder1.testUseOrder(..))")
    public void logAfter2() throws Throwable {
        System.out.println(3 + " aop after2...");
    }

}
