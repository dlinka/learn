package com.cr.annotation.resource;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Resource默认采用的是byName
 * Resource属性的时候可以不用写set方法
 */
@Component
public class Bean1 {

    @Resource
    private Bean2 bean2;

    @Resource(name = "bean3")
    private Bean3 bean3;

}
