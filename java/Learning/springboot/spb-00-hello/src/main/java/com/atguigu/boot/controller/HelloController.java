package com.atguigu.boot.controller;

import com.atguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cgr
 * @date: 2021/12/30 - 11:25
 */

@RestController
public class HelloController {

    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car getCarInfo(){
        return this.car;
    }

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello, Spring Boot 2!!";
    }
}
