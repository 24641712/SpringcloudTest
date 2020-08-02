package com.ccl.springclouda.mybatis_plus.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {
    @Autowired
    private RedisTemplate redisTemplate;

    public void setValuess(String key, String values){
        redisTemplate.opsForValue().set(key,values,10, TimeUnit.MINUTES);
    }

    public Object getValues(String key){
        return redisTemplate.opsForValue().get(key);
    }





}
