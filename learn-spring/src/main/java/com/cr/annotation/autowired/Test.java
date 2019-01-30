package com.cr.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/autowired/application.xml");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        Class1 class1 = context.getBean("class1", Class1.class);
        System.out.println(class1.getClass22());
        System.out.println(class1.getClass3());
    }

}
