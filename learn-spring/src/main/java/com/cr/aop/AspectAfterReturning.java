package com.cr.aop;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectAfterReturning {

    @AfterReturning(pointcut = "execution(* com.cr.aop.Class1.testAfterReturning1(..))", returning = "person")
    public Person logAfterReturning1(Person person) {
        System.out.println("@AfterReturning log...");
        System.out.println("return - " + person);
        person.setName("CR");  //返回值会改变
        return person;
    }

    @AfterReturning(pointcut = "execution(* com.cr.aop.Class1.testAfterReturning2(..))", returning = "str")
    public String logAfterReturning2(String str) {
        System.out.println("@AfterReturning log...");
        System.out.println("return - " + str);
        str = "CR";  //返回值不会改变
        return str;
    }

    @AfterReturning(pointcut = "execution(* com.cr.aop.Class1.testAfterReturning3(..))", returning = "person")
    public Person logAfterReturning3(Person person) {
        System.out.println("@AfterReturning log...");
        System.out.println("return - " + person);
        person = new Person("CR");  //返回值不会改变
        return person;
    }

}
