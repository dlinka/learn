package com.cr.leftCycle.demo5;

import org.springframework.beans.factory.InitializingBean;

public class Bean1 implements InitializingBean{

    public Bean1() {
        System.out.println("Bean1 init...");
    }

    public void initMethod() {
        System.out.println("Bean1 initMethod...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean1 afterPropertiesSet...");
    }

}
