package com.cr.aop.orderAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        OrderAnnotationBean bean = context.getBean("orderAnnotationBean", OrderAnnotationBean.class);
        bean.test();
    }

}
