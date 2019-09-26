package com.cr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class UserService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public String test(String key){
        redisTemplate.opsForValue().set("user:2:name", "CR", 2, TimeUnit.HOURS);
        if(redisTemplate.hasKey(key)){
            return redisTemplate.opsForValue().get(key);
        }else{
            redisTemplate.opsForValue().set(key, "cr");
            return "cr";
        }
    }

}
