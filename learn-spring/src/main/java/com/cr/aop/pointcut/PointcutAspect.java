package com.cr.aop.pointcut;

import com.cr.aop.Person;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointcutAspect {

    @Pointcut("execution(* com.cr.aop.pointcut.PointcutBean.test*(..))")
    public void pointcut() {
    }

    @Before(value = "pointcut()")
    public void log1() {
        System.out.println("log before1...");
    }

    @Before(value = "pointcut()" + "&& args(person)")
    public void log2(Person person) {
        System.out.println("log before2...");
    }

}
