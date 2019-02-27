package com.cr.aop.after;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterAspect {

    @After("execution(* com.cr.aop.after.AfterBean.test1(..))")
    public void log1() {
        System.out.println("log1...");
    }

    @After("execution(* com.cr.aop.after.AfterBean.test2(..))")
    public void log2() {
        System.out.println("log2...");
    }

}
