package com.atguigu.cloud.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: cgr
 * @date: 2022/8/5 - 22:04
 */
@Controller
public class PortalHandler {

    @RequestMapping("/")
    public String showPortalPage() {
        return "index";
    }
}
