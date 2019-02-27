package com.cr.aop.args;


import com.cr.aop.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        ArgsBean bean = context.getBean("argsBean", ArgsBean.class);
        bean.test(new Person("cr"), "b");
    }

}
