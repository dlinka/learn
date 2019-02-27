package com.cr.aop.before;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspect {

    @Before("execution(* com.cr.aop.before.BeforeBean.test(..))")
    public void log() {
        System.out.println("before log...");
    }

}
