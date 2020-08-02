package com.ccl.springclouda;

import com.ccl.springclouda.mybatis_plus.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void valueTest(){
        redisUtil.setValuess("key2","中国台湾");
        String value = (String) redisUtil.getValues("key2");
        log.info("从缓存中获取到值：{}",value);
    }

    @Test
    public void mapTest(){
        Map<String,Object> map = new HashMap<>();
        map.put("key1","光头强");
        map.put("key2","大熊");
        map.put("key3","二熊");

//        redisUtil.putAllMap("map1",map);
        Map<String, Object> allMap = redisUtil.getAllMap("map1");
        redisUtil.putSingleMap("map1","key4","奇奇");
        log.info(allMap.toString());
        String value = (String) redisUtil.getSingleMap("map1","key2");
        log.info(value);


    }



}
