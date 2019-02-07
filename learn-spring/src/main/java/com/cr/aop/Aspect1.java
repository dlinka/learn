package com.cr.aop;

import org.aspectj.lang.annotation.*;

@Aspect
public class Aspect1 {

    @Before("execution(* com.cr.aop.Class1.testBefore(..))")
    public void logBefore() {
        System.out.println("@Before log...");
    }

    @AfterReturning(pointcut = "execution(* com.cr.aop.Class1.testAfterReturning(..))", returning = "obj")
    public void logAfterReturning(Person obj) {
        System.out.println("return - " + obj);
        obj.setName("CR");
        System.out.println("@AfterReturning log...");
    }

    @AfterThrowing(pointcut = "execution(* com.cr.aop.Class1.testAfterThrowing(..))", throwing="ex")
    public void logAfterThrowing(Throwable ex){
        System.out.println("ex - " + ex);
        System.out.println("@AfterThrowing log...");
    }

    @After("execution(* com.cr.aop.Class1.testAfter(..))")
    public void logAfter(){
        System.out.println("@After log...");
    }

}
