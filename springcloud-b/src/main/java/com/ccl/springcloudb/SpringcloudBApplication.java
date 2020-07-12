package com.ccl.springcloudb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudBApplication {

    @Value("${nacos.config}")
    private String config;


    public static void main(String[] args) {
        SpringApplication.run(SpringcloudBApplication.class, args);
    }

    @RequestMapping("/hi1")
    public String hi1Test(){
        return "hi1："+config;

    }

}
