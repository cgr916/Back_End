package com.atguigu.controller;

import com.atguigu.bean.Employee;
import com.atguigu.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

/**
 * @author: cgr
 * @date: 2022/5/22 - 10:34
 */
@Controller
public class EmpController {
    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping("/emp")
    public String get(Model model){
        Collection<Employee> emps = employeeDao.getAll();
        model.addAttribute("Emp",emps);
        System.out.println("所有员工信息:");
        for (Employee e : emps) {
            System.out.print(e.getId());
            System.out.println(e.getLastName());
        }
        return "get";
    }

}
