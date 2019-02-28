package com.cr.leftCycle.demo3;

public class Bean2 {

    private Bean1 bean1;

    public Bean2(){
        System.out.println("Bean2 init...");
    }

    public void setBean1(Bean1 bean1) {
        this.bean1 = bean1;
        System.out.println("set bean1...");
    }

}
