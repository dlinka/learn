package com.cr.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        Class1 class1 = context.getBean("class1", Class1.class);
        //class1.testBefore();
        //System.out.println(class1.testAfterReturning());
        //class1.testAfterThrowing();
        //class1.testAfter2();
        //class1.testAfter1();
        //class1.testAround1();
        //class1.testAround2();
        //System.out.println(class1.testAround3());
    }

}
