package com.atguigu.req_resp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: cgr
 * @date: 2022/5/21 - 10:17
 */
public class Servlet2 extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        System.out.println("servlet2中获取的参数 => " + username);

        Object key = req.getAttribute("key");
        System.out.println("servlet1的标记 => "+key);

        System.out.println("处理servlet2业务");
    }
}
