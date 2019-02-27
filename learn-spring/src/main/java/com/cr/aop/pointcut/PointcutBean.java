package com.cr.aop.pointcut;

import com.cr.aop.Person;
import org.springframework.stereotype.Component;

@Component
public class PointcutBean {

    public void test1(Person person) {
        System.out.println("test1...");
        System.out.println(person);
    }

    public void test2(Person person, String str) {
        System.out.println("test2...");
        System.out.println(person);
        System.out.println(str);
    }

}
