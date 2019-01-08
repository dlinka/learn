package com.cr.proxy.dynamicProxy;

import com.cr.proxy.Subject;
import com.cr.proxy.SubjectImpl;

import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        Subject proxy = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), new Class[]{ Subject.class }, new LogInvocationHandler(subject));
        proxy.request();
        System.out.println();
        System.out.println(proxy.hello());
    }

}
