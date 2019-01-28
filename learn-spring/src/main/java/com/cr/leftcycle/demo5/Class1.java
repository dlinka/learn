package com.cr.leftcycle.demo5;

import org.springframework.beans.factory.InitializingBean;

public class Class1 implements InitializingBean{

    public Class1() {
        System.out.println("Class1 init...");
    }

    public void initMethod() {
        System.out.println("initMethod...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet...");
    }
}
