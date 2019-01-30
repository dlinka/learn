package com.cr.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Autowired默认采用的是byType
 * @Autowired标记属性的时候可以不用写set方法
 * @多于一个实例的时候.抛出BeanCreationException
 */
@Component
public class Class1 {

    @Autowired
    @Qualifier("class22")
    private Class2 class22;

    @Autowired
    private Class3 class3;

    public Class2 getClass22() {
        return class22;
    }

    public Class3 getClass3() {
        return class3;
    }
}
