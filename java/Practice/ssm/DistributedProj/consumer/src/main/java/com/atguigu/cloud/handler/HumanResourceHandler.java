package com.atguigu.cloud.handler;

import com.atguigu.cloud.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author: cgr
 * @date: 2022/8/3 - 12:06
 */
@RestController
public class HumanResourceHandler {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/get/employee")
    public Employee getEmployeeRemote() {
// 远程调用方法的主机地址
        String host = "http://localhost:1010";
// 远程调用方法的具体 URL 地址
        String url = "/provider/get/employee/remote";
        return restTemplate.getForObject(host + url, Employee.class);
    }
}
