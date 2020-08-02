package com.ccl.springcloudb;

import com.ccl.springcloudb.service.impl.ProducerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class SpringcloudBApplicationTests {

    @Autowired
    private ProducerService producerService;

    @Test
    void contextLoads() {

        boolean result = producerService.send("demo", "TAG-A", "Hello RocketMQ_B");
        if(result){
            log.info("B消息发送成功");
        }else{
            log.info("B消息发送失败");
        }


    }

}
