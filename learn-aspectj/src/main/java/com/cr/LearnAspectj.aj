package com.cr;

public aspect LearnAspectj {

    pointcut log():call(* Class1.test(..));

    before():log(){
        System.out.println("aspectj before log...");
    }

    after():log(){
        System.out.println("aspectj after log...");
    }

}
