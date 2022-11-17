package com.atguigu.cloud.handler;

import com.atguigu.cloud.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: cgr
 * @date: 2022/8/3 - 15:45
 */
@RestController
public class EmpResolver {

    @RequestMapping("/provider/get/employee")
    public Employee getEmployeeRemote(HttpServletRequest request) {
        // 获取当前 Web 应用的端口号
        int serverPort = request.getServerPort();
        return new Employee(666, "tom666-"+serverPort, 6666.6);
    }
}
