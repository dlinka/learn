package com.cr.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {

    @Autowired
    @Qualifier("bean21")
    private Bean2 bean21;

    @Autowired
    @Qualifier("bean22")
    private Bean2 bean22;

    @Autowired
    private Bean3 bean3;

    @Override
    public String toString() {
        return "Bean1{" +
                "bean21=" + bean21 +
                ", bean22=" + bean22 +
                ", bean3=" + bean3 +
                '}';
    }

}
