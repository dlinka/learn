package com.cr.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Autowired默认采用的是byType
 * Autowired属性的时候可以不用写set方法
 */
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

    public Bean2 getBean21() {
        return bean21;
    }

    public Bean2 getBean22() {
        return bean22;
    }

    public Bean3 getBean3() {
        return bean3;
    }
}
