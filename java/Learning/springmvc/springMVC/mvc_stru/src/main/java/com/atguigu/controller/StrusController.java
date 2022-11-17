package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: cgr
 * @date: 2022/5/21 - 15:18
 */
@Controller
public class StrusController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }


}
