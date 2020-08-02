package com.ccl.springclouda;

import com.ccl.springclouda.mybatis_plus.util.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

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
//        redisTemplate.opsForValue().set("key","hello world");
//        String value = (String) redisTemplate.opsForValue().get("key");
//        log.info("从缓存中获取到值：{}",value);
    }




}
