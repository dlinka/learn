package com.cr.aop;

import org.springframework.stereotype.Component;

@Component
public class Class1 {

    public void testBefore() {
        System.out.println("test @Before...");
    }

    public Person testAfterReturning() {
        System.out.println("test @AfterReturning...");
        Person person = new Person();
        person.setName("cr");
        return person;
    }

    public void testAfterThrowing() {
        int i = 1 / 0;
        System.out.println("test @AfterThrowing...");
    }

    public void testAfter() {
        int i = 1 / 0;
        System.out.println("test @After...");
    }

}
