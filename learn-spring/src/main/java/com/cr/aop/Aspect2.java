package com.cr.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class Aspect2 {

    @Before("execution(* com.cr.aop.Class2.testBefore(..))")
    public void testBefore(JoinPoint jp){
        System.out.println("aop before...");
        System.out.println("目标对象 - " + jp.getTarget());
        System.out.println("方法名 - " + jp.getSignature().getName());
        Object[] args = jp.getArgs();
        System.out.println("方法参数 - " + args);
        Person p = (Person) args[0];
        p.setName("CR");  //改变了
        args[1] = "bbb";  //没有改变
    }

    @AfterReturning(pointcut = "execution(* com.cr.aop.Class2.testAfterReturning(..))")
    public void testAfterReturning(JoinPoint jp){
        System.out.println("aop afterReturning...");
        System.out.println("目标对象 - " + jp.getTarget());
        System.out.println("方法名 - " + jp.getSignature().getName());
        System.out.println("方法参数 - " + Arrays.toString(jp.getArgs()));
    }

    @Around("execution(* com.cr.aop.Class2.testAround(..))")
    public void testAround(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("aop around...");
        System.out.println("目标对象 - " + jp.getTarget());
        System.out.println("方法名 - " + jp.getSignature().getName());
        Object[] args = jp.getArgs();
        System.out.println("方法参数 - " + args);
        Person p = (Person) args[0];
        p.setName("CR");  //改变了
        args[1] = "bbb";  //改变了
        jp.proceed(args);
    }

}
