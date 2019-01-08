package com.cr.proxy.staticProxy;

import com.cr.proxy.Subject;

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(){

    }

    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void beforeRequest(){
        System.out.println("Proxy before request...");
    }

    @Override
    public void request() {
        beforeRequest();
        subject.request();
        afterRequest();
    }

    @Override
    public String hello() {
        return "hello";
    }

    public void afterRequest(){
        System.out.println("Proxy after request...");
    }

}
