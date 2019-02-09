package com.cr.aop;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectAfterThrowing {

    @AfterThrowing(pointcut = "execution(* com.cr.aop.Class1.testAfterThrowing(..))", throwing = "ex")
    public void logAfterThrowing(Throwable ex) {
        System.out.println("ex - " + ex);
        System.out.println("@AfterThrowing log...");
    }

}
