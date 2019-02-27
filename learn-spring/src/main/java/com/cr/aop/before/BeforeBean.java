package com.cr.aop.before;

import org.springframework.stereotype.Component;

@Component
public class BeforeBean {

    public void test() {
        System.out.println("test...");
    }

}
