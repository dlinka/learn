package com.cr.aop.around;

import org.springframework.stereotype.Component;

@Component
public class AroundBean {

    public void test1() {
        System.out.println("test1...");
    }

    public void test2() {
        int i = 1 / 0;
        System.out.println("test2...");
    }

    public int test3() {
        System.out.println("test3...");
        return 1;
    }

}
