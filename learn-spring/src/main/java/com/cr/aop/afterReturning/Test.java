package com.cr.aop.afterReturning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        AfterReturningBean bean = context.getBean("afterReturningBean", AfterReturningBean.class);
        System.out.println(bean.test());
    }

}
