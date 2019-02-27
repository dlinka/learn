package com.cr.aop.after;

import org.springframework.stereotype.Component;

@Component
public class AfterBean {

    public void test1() {
        System.out.println("test1...");
    }

    public void test2() {
        int i = 1 / 0;
        System.out.println("test2...");
    }

}
