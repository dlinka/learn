package com.cr.aop.afterThrowing;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterThrowingAspect {

    @AfterThrowing(pointcut = "execution(* com.cr.aop.afterThrowing.AfterThrowingBean.test(..))", throwing = "ex")
    public void log(Throwable ex) {
        System.out.println("ex - " + ex);
        System.out.println("log...");
    }

}
