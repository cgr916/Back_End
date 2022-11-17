package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: cgr
 * @date: 2022/8/5 - 22:02
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AuthConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(AuthConsumerApp.class, args);
    }
}
