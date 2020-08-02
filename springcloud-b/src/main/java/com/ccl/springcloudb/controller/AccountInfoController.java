package com.ccl.springcloudb.controller;

import com.ccl.springcloudb.service.AccountInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("account")
@Slf4j
public class AccountInfoController {

    @Autowired
    private AccountInfoService accountInfoService;

    @PostMapping("transfer")
    public String transfer(@RequestParam("accountNo") String accountNo){
        accountInfoService.sendUpdateAccountBalance("3019019:50");
        return "成功";
    }



}
