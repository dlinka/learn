package com.cr.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("placeholder/application.xml");
        System.out.println(context.getBean("class1", Class1.class).getName());
        System.out.println(context.getBean("class2", Class2.class).getName());
        System.out.println(context.getBean("class2", Class2.class).getPassword());
    }

}
