package com.ccl.springclouda.mybatis_plus.message;

import com.ccl.springclouda.mybatis_plus.service.AccountInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RocketMQMessageListener(topic = "demo", consumerGroup = "defaultGroup")
public class TxmsgConsumer implements RocketMQListener<String> {

    @Autowired
    private AccountInfoService accountInfoService;

    @Override
    public void onMessage(String s) {
        log.info("接收到消息：{}",s);
        accountInfoService.addAccountInfoBalance(s);


    }



}
