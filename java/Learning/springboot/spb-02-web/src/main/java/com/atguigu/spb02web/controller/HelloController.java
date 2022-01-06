package com.atguigu.spb02web.controller;

import com.atguigu.spb02web.bean.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cgr
 * @date: 2021/12/30 - 18:45
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User getUser(){
        return new User("mht",52);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello!";
    }

    @RequestMapping("/1.png")
    public String pic(){
        return  "It's a picture!";
    }
}
