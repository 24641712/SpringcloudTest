package com.ccl.springclouda;

import com.ccl.springclouda.mybatis_plus.service.impl.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringcloudAApplicationTests {

    @Autowired
    private ProducerService producerService;


    @Test
    void contextLoads() {
        boolean result = producerService.send("demo", "TAG-A", "Hello RocketMQ_A");
        if(result){
            log.info("A消息发送成功");
        }else{
            log.info("B消息发送失败");
        }


    }

}
