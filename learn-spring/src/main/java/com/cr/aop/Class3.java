package com.cr.aop;

import org.springframework.stereotype.Component;

@Component
public class Class3 {

    public void testPointcut1(Person person, String str) {
        System.out.println("test pointcut...");
        System.out.println(person);
        System.out.println(str);
    }

    public void testPointcut2(Person person) {
        System.out.println("test pointcut...");
        System.out.println(person);
    }

}
