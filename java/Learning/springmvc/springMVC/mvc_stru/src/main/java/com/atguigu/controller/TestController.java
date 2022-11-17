package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: cgr
 * @date: 2022/5/21 - 15:34
 */
@Controller
@RequestMapping("/hello")
public class TestController {
    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/form")
    public String form(){
        return "test";
    }
}
