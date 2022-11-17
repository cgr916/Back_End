package com.atguigu.boot.handler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: cgr
 * @date: 2022/7/20 - 17:33
 */
@RestController
public class HelloHandler {


        @RequestMapping("/hello")
        public String handle01(){
            return "Hello, Spring Boot 2!";
        }

        @RequestMapping(value = "/user",method = RequestMethod.GET)
        public String handle02(){
            return "get user!";
        }

        @RequestMapping(value = "/user",method = RequestMethod.POST)
        public String handle03(){
            return "post user!";
        }

}
