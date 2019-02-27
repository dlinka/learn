package com.cr.aop.afterThrowing;

import org.springframework.stereotype.Component;

@Component
public class AfterThrowingBean {

    public void test() {
        int i = 1 / 0;
        System.out.println("test...");
    }

}
