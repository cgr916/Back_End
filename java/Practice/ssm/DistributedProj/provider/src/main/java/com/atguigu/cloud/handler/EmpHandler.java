package com.atguigu.cloud.handler;

import com.atguigu.cloud.Employee;
import com.atguigu.cloud.util.ResultEntity;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/8/3 - 11:40
 */
@RestController
public class EmpHandler {
    @RequestMapping("/provider/get/employee/remote")
    public Employee getEmployeeRemote() {

        return new Employee(555, "tom555", 555.55);
    }

    @RequestMapping("/provider/get/employee/list")
    public List<Employee> getEmpList(@RequestParam("keyword") String keyword) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, "emp_01", 1.1));
        list.add(new Employee(2, "emp_02", 2.2));
        list.add(new Employee(3, keyword, 3.3));
        return list;
    }

    @RequestMapping("/provider/get/employee/by")
    public Employee getEmployeeById(@RequestParam("empId") Integer empId) {
        return new Employee(empId, "tom999-", 999.99);
    }

    @HystrixCommand(fallbackMethod = "getEmpBackup")
    @RequestMapping("/provider/hytrix/get/employee")
    public ResultEntity<Employee> getEmp(@RequestParam("flag") String flag) throws InterruptedException {
        if(flag.equals("error")) throw new RuntimeException(" meet some error!");
        if(flag.equals("block")){
            Thread.sleep(5000);
        }
        return ResultEntity.successWithData(new Employee(6, "hytrix", 6.6));
    }

    public ResultEntity<Employee> getEmpBackup(@RequestParam("flag") String flag){
        return ResultEntity.failed("net error!");
    }

}
