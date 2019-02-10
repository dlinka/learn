package com.cr.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        Class1 class1 = context.getBean("class1", Class1.class);
        //class1.testBefore();
        //System.out.println(class1.testAfterReturning1());
        //System.out.println(class1.testAfterReturning2());
        //System.out.println(class1.testAfterReturning3());
        //class1.testAfterThrowing();
        //class1.testAfter2();
        //class1.testAfter1();
        //class1.testAround1();
        //class1.testAround2();
        //System.out.println(class1.testAround3());

        Class2 class2 = context.getBean("class2", Class2.class);
        //class2.testBefore(new Person("cr"), "b");
        //class2.testAfterReturning(new Person("cr"), "b");
        //class2.testAround(new Person("cr"), "b");
        //class2.testAfter(new Person("cr"), "cr");

        //Order1 order1 = context.getBean("order1", Order1.class);
        //order1.testOrder();
        //UseOrder1 userOrder1 = context.getBean("useOrder1", UseOrder1.class);
        //userOrder1.testUseOrder();

        Class3 class3 = context.getBean("class3", Class3.class);
        class3.testPointcut1(new Person("cr"), "cr");
        class3.testPointcut2(new Person("cr"));

    }

}
