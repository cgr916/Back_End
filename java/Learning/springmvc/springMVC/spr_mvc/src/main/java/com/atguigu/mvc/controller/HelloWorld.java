package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: cgr
 * @date: 2022/7/15 - 20:11
 */
@Controller
//@RequestMapping("/test")
public class HelloWorld {
    @RequestMapping("/")
    public String index() {
        //设置视图名称
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        //设置视图名称
        return "hello";
    }

}
