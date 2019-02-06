package com.cr.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspect1 {

    @Before("execution(* com.cr.aop.*.*(..))")
    public void beforeLog(){
        System.out.println("aspect before log...");
    }

}
