package com.ccl.springclouda.mybatis_plus.controller;

import com.ccl.springclouda.mybatis_plus.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mybatis_plus")
@Slf4j
public class MPController {

    @Value("${nacos.config}")
    private String config;

    @Autowired
    private UserService userService;

    @PostMapping("exeJob")
    public String mybatis_plus(String arg){
        log.info("当前传参：{}",arg);
        return userService.list().toString();
    }



}
