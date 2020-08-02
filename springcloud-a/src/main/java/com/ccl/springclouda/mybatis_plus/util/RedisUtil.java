package com.ccl.springclouda.mybatis_plus.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;
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

    public void putAllMap(String key, Map<String,Object> map){
        redisTemplate.opsForHash().putAll(key,map);
    }

    public void putSingleMap(String key, String hashKey, String value){
        redisTemplate.opsForHash().put(key,hashKey,value);
    }

    public Map<String,Object> getAllMap(String key){
        return redisTemplate.opsForHash().entries(key);
    }

    public Object getSingleMap(String key,String hashKey){
        return redisTemplate.opsForHash().get(key,hashKey);
    }



}
