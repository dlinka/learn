package com.cr.factoryBean;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBean1 implements FactoryBean<Interface1> {

    private Interface1 bean1;

    public FactoryBean1(){
        bean1 = new Bean1();
    }

    @Override
    public Interface1 getObject() throws Exception {
        return bean1;
    }

    @Override
    public Class<?> getObjectType() {
        return Bean1.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
