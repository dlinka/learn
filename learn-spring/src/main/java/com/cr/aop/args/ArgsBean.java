package com.cr.aop.args;

import com.cr.aop.Person;
import org.springframework.stereotype.Component;

@Component
public class ArgsBean {

    public void test(Person person, String str) {
        System.out.println("test...");
        System.out.println(person);
        System.out.println(str);
    }

}
