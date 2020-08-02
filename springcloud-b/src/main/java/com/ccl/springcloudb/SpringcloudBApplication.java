package com.ccl.springcloudb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class SpringcloudBApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudBApplication.class, args);
    }


}
