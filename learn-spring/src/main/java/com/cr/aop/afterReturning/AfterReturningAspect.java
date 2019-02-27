package com.cr.aop.afterReturning;

import com.cr.aop.Person;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterReturningAspect {

    @AfterReturning(pointcut = "execution(* com.cr.aop.afterReturning.AfterReturningBean.test(..))", returning = "person")
    public Person log(Person person) {
        System.out.println("log...");
        System.out.println("return - " + person);
        //返回值会改变
        //person.setName("CR");
        //返回值不会改变
        //person = new Person("CR");
        return person;
    }

}
