package com.cr.annotation.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Resource标记属性的时候可以不用写set方法
 */
@Component
public class Class1 {

    @Resource
    private Class2 class2;

    @Resource(name = "class3")
    private Class3 class3;

    public void testClass2() {
        System.out.println(class2 == null);
    }

    public void testClass3() {
        System.out.println(class3);
    }

}
