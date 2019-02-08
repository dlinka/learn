package com.cr.aop;

import org.springframework.stereotype.Component;

@Component
public class Class1 {

    public void testBefore() {
        System.out.println("test @Before...");
    }

    public Person testAfterReturning1() {
        System.out.println("test @AfterReturning1...");
        return new Person("cr");
    }

    public String testAfterReturning2() {
        System.out.println("test @AfterReturning2...");
        return "cr";
    }

    public void testAfterThrowing() {
        int i = 1 / 0;
        System.out.println("test @AfterThrowing...");
    }

    public void testAfter1() {
        System.out.println("test @After1...");
    }

    public void testAfter2() {
        int i = 1 / 0;
        System.out.println("test @After2...");
    }

    public void testAround1() {
        int i = 1 / 0;
        System.out.println("test @Around1...");
    }

    public void testAround2() {
        System.out.println("test @Around2...");
    }

    public int testAround3() {
        System.out.println("test @Around3...");
        return 1;
    }

}
