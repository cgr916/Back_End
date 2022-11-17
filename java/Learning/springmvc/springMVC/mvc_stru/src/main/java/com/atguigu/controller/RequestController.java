package com.atguigu.controller;

import com.atguigu.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: cgr
 * @date: 2022/5/21 - 20:03
 */
@Controller
public class RequestController {
    @RequestMapping("/req_param")
    public String reqParams(String username, String password) {
        System.out.println("username："+username+"  password："+password);
        return "req";
    }

    @RequestMapping("/req_params")
    public String reqParams(
        @RequestParam("user_name") String username,
        String password,
        String info
    ) {
        System.out.println("username："+username+"  password："+password+"  info："+info);
        return "req";
    }

    @RequestMapping("/usr")
    public String reqUsrList(
            User user
//            @RequestParam("name") String userName,
//            @RequestParam("password") String password,
//            @RequestParam("sex") String sex,
//            @RequestParam("info") String info
    ){
        System.out.println(user);
        return "user";
    }


}
