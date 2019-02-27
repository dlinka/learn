package com.cr.aop.order;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        OrderBean bean = context.getBean("orderBean", OrderBean.class);
        bean.test();
    }

}
