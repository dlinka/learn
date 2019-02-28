package com.cr.leftCycle.demo5;

import org.springframework.beans.factory.InitializingBean;

public class Bean2 implements InitializingBean{

    private Bean1 bean1;

    public Bean2() {
        System.out.println("Bean2 init...");
    }

    public void setBean1(Bean1 bean1) {
        this.bean1 = bean1;
        System.out.println("set bean1...");
    }

    public void initMethod() {
        System.out.println("Bean2 initMethod...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean2 afterPropertiesSet...");
    }

}
