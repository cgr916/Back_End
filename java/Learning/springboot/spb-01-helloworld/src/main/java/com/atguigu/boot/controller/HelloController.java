package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: cgr
 * @date: 2021/12/7 - 22:31
 */

@Controller
@ResponseBody
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        return "Hello,Spring Boot 2";
    }
}

