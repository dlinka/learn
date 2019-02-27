package com.cr.aop.orderAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(4)
public class AspectAnnotation4 {

    @Around("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log3(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Aspect4 Around start log3...");
        jp.proceed();
        System.out.println("Aspect4 Around end log3...");
    }

    @Around("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log1(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Aspect4 Around start log1...");
        jp.proceed();
        System.out.println("Aspect4 Around end log1...");
    }

    @Around("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log2(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("Aspect4 Around start log2...");
        jp.proceed();
        System.out.println("Aspect4 Around end log2...");
    }
}
