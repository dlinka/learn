package com.cr.factoryBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("factoryBean/application.xml");
        Interface1 interface1 = context.getBean("factoryBean1", Interface1.class);
        Interface1 interface2 = context.getBean("factoryBean1", Interface1.class);
        System.out.println(interface1==interface2);

    }

}
