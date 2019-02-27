package com.cr.aop.orderAnnotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(3)
public class AspectAnnotation3 {

    @After("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log3() {
        System.out.println("Aspect3 After log 3...");
    }

    @After("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log1() {
        System.out.println("Aspect3 After log 1...");
    }

    @After("execution(* com.cr.aop.orderAnnotation.OrderAnnotationBean.test(..))")
    public void log2() throws Throwable {
        System.out.println("Aspect3 After log 2...");
    }

}
