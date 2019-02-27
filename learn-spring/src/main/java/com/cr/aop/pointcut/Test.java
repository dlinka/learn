package com.cr.aop.pointcut;

import com.cr.aop.Person;
import com.cr.aop.around.AroundBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop/application.xml");
        PointcutBean bean = context.getBean("pointcutBean", PointcutBean.class);
        bean.test1(new Person("cr"));
        bean.test2(new Person("cr"), "cr");
    }

}
