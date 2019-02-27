package com.cr.aop.before;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        BeforeBean bean = context.getBean("beforeBean", BeforeBean.class);
        bean.test();
    }

}
