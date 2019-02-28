package com.cr.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("placeholder/application.xml");
        System.out.println(context.getBean("bean1", Bean1.class).getName());
    }

}
