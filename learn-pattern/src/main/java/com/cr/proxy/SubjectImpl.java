package com.cr.proxy;

public class SubjectImpl implements Subject {

    @Override
    public void request() {
        System.out.println("SubjectImpl request...");
    }

    @Override
    public String hello() {
        return "hello";
    }

}
