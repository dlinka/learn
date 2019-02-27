package com.cr.aop.around;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        AroundBean bean = context.getBean("aroundBean", AroundBean.class);
        bean.test1();
        //bean.test2();
        System.out.println(bean.test3());
    }

}
