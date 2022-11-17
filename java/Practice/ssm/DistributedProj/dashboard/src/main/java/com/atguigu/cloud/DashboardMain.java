package com.atguigu.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author: cgr
 * @date: 2022/8/4 - 11:01
 */
@EnableHystrixDashboard
@SpringBootApplication
public class DashboardMain {
    public static void main(String[] args) {
        SpringApplication.run(DashboardMain.class,args);
    }
}
