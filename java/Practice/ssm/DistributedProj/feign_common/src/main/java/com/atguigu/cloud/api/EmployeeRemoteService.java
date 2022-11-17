package com.atguigu.cloud.api;

import com.atguigu.cloud.Employee;
import com.atguigu.cloud.bean.MyFallBackFactory;
import com.atguigu.cloud.util.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: cgr
 * @date: 2022/8/3 - 17:31
 */
@FeignClient(value="atguigu-provider", fallbackFactory= MyFallBackFactory.class)
public interface EmployeeRemoteService {
    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote();

    @RequestMapping("/provider/get/employee/by")
    public Employee getEmployeeById(@RequestParam("empId") Integer empId);

    @RequestMapping("/provider/get/employee/list")
    public List<Employee> getEmpList(@RequestParam("keyword") String keyword);

    @RequestMapping("/provider/hytrix/get/employee")
    public ResultEntity<Employee> getEmp(@RequestParam("flag") String flag);
}
