package com.atguigu.crowd.mvc.handler;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.util.CrowdConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author: cgr
 * @date: 2022/7/18 - 20:50
 */
@Controller
public class AdminHandler {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/admin/login.html")
    public String login() {
        return "admin_login";
    }

    @RequestMapping("/admin/main.html")
    public String mainScen(
            @RequestParam("loginName") String loginName,
            @RequestParam("loginPswd") String loginPswd,
            HttpSession session
    ) {
        Admin admin = adminService.getAdminByLoginAcc(loginName, loginPswd);
        session.setAttribute("admin",admin.getUsrAcct());

//        return "admin_main";
        return "redirect:/admin/login.html";
    }
}
