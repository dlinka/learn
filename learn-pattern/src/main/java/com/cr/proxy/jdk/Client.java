package com.cr.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {

    public static void main(String[] args) {
        InvocationHandler handler = new LogInvocationHandler(new DrugServiceImpl());
        DrugService proxy = (DrugService) Proxy.newProxyInstance(DrugServiceImpl.class.getClassLoader(), DrugServiceImpl.class.getInterfaces(), handler);
        proxy.sell();
    }

}
