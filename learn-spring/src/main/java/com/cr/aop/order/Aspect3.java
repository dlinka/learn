package com.cr.aop.order;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Aspect3 {

    @After("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log3() {
        System.out.println("Aspect3 After log 3...");
    }

    @After("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log1() {
        System.out.println("Aspect3 After log 1...");
    }

    @After("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log2() throws Throwable {
        System.out.println("Aspect3 After log 2...");
    }

}
