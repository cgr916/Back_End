package com.atguigu.cloud.handler;

import com.atguigu.cloud.Employee;
import com.atguigu.cloud.api.EmployeeRemoteService;
import com.atguigu.cloud.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/8/3 - 16:29
 */
@RestController
public class EmployeeFeignHandler {
    @Resource
    private EmployeeRemoteService employeeRemoteService;
    @RequestMapping("/feign/get/emp")
    public Employee getEmployeeRemote() {
        return employeeRemoteService.getEmployeeRemote();
    }

    @RequestMapping("/feign/get/employee/by")
    public Employee getEmployeeById(@RequestParam("empId") Integer empId) {
        return employeeRemoteService.getEmployeeById(empId);
    }

    @RequestMapping("/feign/get/employee/list")
    public List<Employee> getEmpList(@RequestParam("keyword") String keyword) {
        return employeeRemoteService.getEmpList(keyword);
    }

    @RequestMapping("/feign/get/employee/hytrix")
    public ResultEntity<Employee> getEmp(@RequestParam("flag") String flag) {
        return employeeRemoteService.getEmp(flag);
    }

}
