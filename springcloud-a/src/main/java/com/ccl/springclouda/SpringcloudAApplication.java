package com.ccl.springclouda;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
public class SpringcloudAApplication {

    @Value("${nacos.config}")
    private String hello;

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAApplication.class, args);
    }

    @RequestMapping("/hi")
    public String hiTest(){
        return "hi："+hello;
    }




}
