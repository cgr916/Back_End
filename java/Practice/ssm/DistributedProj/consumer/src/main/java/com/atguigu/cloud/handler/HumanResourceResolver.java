package com.atguigu.cloud.handler;

import com.atguigu.cloud.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author: cgr
 * @date: 2022/8/3 - 15:09
 */
@RestController
public class HumanResourceResolver {
    @Resource
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/ribbon/get/employee")
    public Employee getEmployeeRemote() {
    // 远程调用方法的主机地址
        // String host = "http://localhost:1000";
    // 引入 Eureka 和 Ribbon 后，就可以使用微服务名称替代 IP 地址+端口号
        String host = "http://atguigu-provider";
    // 远程调用方法的具体 URL 地址
        String url = "/provider/get/employee/remote";
        return restTemplate.getForObject(host + url, Employee.class);
    }

    @RequestMapping("/consumer/hytrix/get/employee")
    public Employee getEmployee(@RequestParam("flag") String flag) {
        // 远程调用方法的主机地址
        // String host = "http://localhost:1000";
        // 引入 Eureka 和 Ribbon 后，就可以使用微服务名称替代 IP 地址+端口号
        String host = "http://atguigu-provider";
        // 远程调用方法的具体 URL 地址
        String url = "/provider/hytrix/get/employee?"+flag;
        return restTemplate.getForObject(host + url, Employee.class);
    }
}
