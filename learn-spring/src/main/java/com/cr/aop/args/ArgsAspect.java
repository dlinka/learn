package com.cr.aop.args;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Arrays;

@Aspect
public class ArgsAspect {

    @Before("execution(* com.cr.aop.args.ArgsBean.test(..))")
    public void testBefore(JoinPoint jp){
        System.out.println("目标对象 - " + jp.getTarget());
        System.out.println("方法名 - " + jp.getSignature().getName());
        System.out.println("方法参数 - " + Arrays.toString(jp.getArgs()));
    }

}
