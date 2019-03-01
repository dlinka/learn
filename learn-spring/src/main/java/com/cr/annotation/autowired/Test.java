package com.cr.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation/autowired/application.xml");
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }

}
