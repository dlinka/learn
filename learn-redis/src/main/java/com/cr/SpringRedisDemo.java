package com.cr;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringRedisDemo {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-redis.xml");
        System.out.println(ctx.getBean(UserService.class).test("user:1:name"));
    }

}
