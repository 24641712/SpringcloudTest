package com.ccl.springclouda.mybatis_plus.service.impl;

import com.ccl.springclouda.mybatis_plus.service.AccountInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class AccountInfoServiceImpl implements AccountInfoService {

    @Override
    @Transactional
    public void addAccountInfoBalance(String accountChangeEvent) {
        log.info("更新本地事务执行成功，本次事务号: {}", accountChangeEvent);

    }
}
