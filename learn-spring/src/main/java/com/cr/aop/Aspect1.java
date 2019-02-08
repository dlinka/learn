package com.cr.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class Aspect1 {

    @Before("execution(* com.cr.aop.Class1.testBefore(..))")
    public void logBefore() {
        System.out.println("@Before log...");
    }

    @AfterReturning(pointcut = "execution(* com.cr.aop.Class1.testAfterReturning1(..))", returning = "obj")
    public Person logAfterReturning1(Person obj) {
        System.out.println("@AfterReturning log...");
        System.out.println("return - " + obj);
        obj.setName("CR");
        return obj;  //返回值有效
    }

    @AfterReturning(pointcut = "execution(* com.cr.aop.Class1.testAfterReturning2(..))", returning = "obj")
    public String logAfterReturning2(String obj) {
        System.out.println("@AfterReturning log...");
        System.out.println("return - " + obj);
        obj = "CR";
        return obj;  //返回值无效
    }

    @AfterThrowing(pointcut = "execution(* com.cr.aop.Class1.testAfterThrowing(..))", throwing = "ex")
    public void logAfterThrowing(Throwable ex) {
        System.out.println("ex - " + ex);
        System.out.println("@AfterThrowing log...");
    }

    @After("execution(* com.cr.aop.Class1.testAfter1(..))")
    public void logAfter1() {
        System.out.println("@After1 log...");
    }

    @After("execution(* com.cr.aop.Class1.testAfter2(..))")
    public void logAfter2() {
        System.out.println("@After2 log...");
    }

    @Around("execution(* com.cr.aop.Class1.testAround1(..))")
    public void logAround1(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("@Around log1...");
        jp.proceed();
        System.out.println("@Around log2...");
    }

    @Around("execution(* com.cr.aop.Class1.testAround2(..))")
    public void logAround2(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("@Around log1...");
        jp.proceed();
        System.out.println("@Around log2...");
    }

    @Around("execution(* com.cr.aop.Class1.testAround3(..))")
    public int logAround3(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("@Around log1...");
        int i = (int) jp.proceed();
        System.out.println("i - " + i);
        System.out.println("@Around log2...");
        return 1024;
    }


}
