package com.cr.leftcycle.demo3;

public class Class2 {

    private Class1 class1;

    public Class2(){
        System.out.println("Class2 init...");
    }

    public Class1 getClass1() {
        return class1;
    }

    public void setClass1(Class1 class1) {
        this.class1 = class1;
        System.out.println("set Class1...");
    }

}
