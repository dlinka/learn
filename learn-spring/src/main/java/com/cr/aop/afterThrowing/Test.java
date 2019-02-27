package com.cr.aop.afterThrowing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        AfterThrowingBean bean = context.getBean("afterThrowingBean", AfterThrowingBean.class);
        bean.test();
    }

}
