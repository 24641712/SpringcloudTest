package com.ccl.springcloudb.service.impl;

import com.ccl.springcloudb.service.AccountInfoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.TransactionSendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class AccountInfoServiceImpl implements AccountInfoService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void sendUpdateAccountBalance(String accountChangeEvent) {

        Message<String> message = MessageBuilder.withPayload(accountChangeEvent).build();
        rocketMQTemplate.convertAndSend("topic_txmsg",message);
        log.info("send transcation message body={},result={}",message.getPayload());

    }
}
