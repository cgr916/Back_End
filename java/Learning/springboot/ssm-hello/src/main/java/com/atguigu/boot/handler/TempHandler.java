package com.atguigu.boot.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author: cgr
 * @date: 2022/7/29 - 23:19
 */
@Controller
public class TempHandler {
    @RequestMapping("/test/thymeleaf")
    public String test(ModelMap modelMap, HttpSession httpSession)
    {
        modelMap.addAttribute("model", "This is modelMap");
        httpSession.setAttribute("session","This is Session");
        return "index";

    }
}
