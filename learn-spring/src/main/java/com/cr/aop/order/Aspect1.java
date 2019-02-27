package com.cr.aop.order;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect1 {

    @Before("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log3() {
        System.out.println("Aspect1 Before log 3...");
    }

    @Before("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log1() {
        System.out.println("Aspect1 Before log 1...");
    }

    @Before("execution(* com.cr.aop.order.OrderBean.test(..))")
    public void log2() {
        System.out.println("Aspect1 Before log 2...");
    }

}
