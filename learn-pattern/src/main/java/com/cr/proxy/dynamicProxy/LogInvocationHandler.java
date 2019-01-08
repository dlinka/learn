package com.cr.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInvocationHandler implements InvocationHandler {

    private Object obj;

    public LogInvocationHandler(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Start Log Proxy...");
        method.invoke(obj, args);
        System.out.println("End Log Proxy...");
        return null;
    }

}
