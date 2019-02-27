package com.cr.aop.orderAnnotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class AspectAnnotation1 {

    @Before("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log3() {
        System.out.println("Aspect1 Before log 3...");
    }

    @Before("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log1() {
        System.out.println("Aspect1 Before log 1...");
    }

    @Before("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log2() {
        System.out.println("Aspect1 Before log 2...");
    }

}
