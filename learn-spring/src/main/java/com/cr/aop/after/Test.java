package com.cr.aop.after;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        AfterBean bean = context.getBean("afterBean", AfterBean.class);
        bean.test1();
        bean.test2();
    }

}
