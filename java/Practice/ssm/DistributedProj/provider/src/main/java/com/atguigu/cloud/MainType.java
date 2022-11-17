package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @author: cgr
 * @date: 2022/8/3 - 11:29
 */
@EnableCircuitBreaker
@SpringBootApplication
public class MainType {
    public static void main(String[] args) {
        SpringApplication.run(MainType.class,args);
    }
}
