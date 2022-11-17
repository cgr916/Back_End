package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: cgr
 * @date: 2022/5/14 - 20:48
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
