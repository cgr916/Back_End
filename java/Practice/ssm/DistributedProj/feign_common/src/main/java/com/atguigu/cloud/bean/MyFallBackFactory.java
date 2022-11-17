package com.atguigu.cloud.bean;

import com.atguigu.cloud.Employee;
import com.atguigu.cloud.api.EmployeeRemoteService;
import com.atguigu.cloud.util.ResultEntity;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author: cgr
 * @date: 2022/8/4 - 10:45
 */
@Component
public class MyFallBackFactory implements FallbackFactory<EmployeeRemoteService> {
    // cause 对象是失败原因对应的异常对象
    @Override
    public EmployeeRemoteService create(Throwable cause) {
        return new EmployeeRemoteService() {

            @Override
            public List<Employee> getEmpList(String keyword) {
                return null;
            }

            @Override
            public ResultEntity<Employee> getEmp(String flag) {
                return ResultEntity.failed(cause.getMessage()+"hahahah");
            }


            @Override
            public Employee getEmployeeRemote() {
                return new Employee(1,"hytrix",1.1111);
            }

            @Override
            public Employee getEmployeeById(Integer empId) {
                return null;
            }
        };
    }
}
