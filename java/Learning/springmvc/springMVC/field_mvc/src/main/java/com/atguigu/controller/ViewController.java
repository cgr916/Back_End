package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: cgr
 * @date: 2022/5/21 - 22:58
 */
@Controller
public class ViewController {

    @RequestMapping("/thy")
    public String thy(){
        return "thymleaf";
    }
}
