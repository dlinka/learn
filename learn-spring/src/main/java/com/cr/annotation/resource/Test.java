package com.cr.annotation.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/resource/application.xml");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
        Class1 class1 = context.getBean("class1", Class1.class);
        class1.testClass2();
        class1.testClass3();
    }

}
