package com.cr.aop.afterReturning;

import com.cr.aop.Person;
import org.springframework.stereotype.Component;

@Component
public class AfterReturningBean {

    public Person test() {
        System.out.println("test...");
        return new Person("cr");
    }

}
