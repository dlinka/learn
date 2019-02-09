package com.cr.aop;

import org.springframework.stereotype.Component;

@Component
public class Class2 {

    public void testBefore(Person person, String str) {
        System.out.println("test before...");
        System.out.println(person);
        System.out.println(str);
    }

    public void testAfterReturning(Person person, String str) {
    }

    public void testAround(Person person, String str){
        System.out.println("test around...");
        System.out.println(person);
        System.out.println(str);
    }

    public void testAfter(Person person, String str){
        person.setName("CR");
        str = "CR";
    }

}
