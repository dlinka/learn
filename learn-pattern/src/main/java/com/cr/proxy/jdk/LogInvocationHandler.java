package com.cr.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler {

    private Object obj;

    public LogInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("log start...");
        method.invoke(obj, args);
        System.out.println("log end...");
        return null;
    }

}
