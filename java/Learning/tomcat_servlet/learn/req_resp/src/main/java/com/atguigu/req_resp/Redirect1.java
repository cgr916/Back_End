package com.atguigu.req_resp;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: cgr
 * @date: 2022/5/21 - 10:58
 */
public class Redirect1 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("redirect1服务已弃用，为您重定向至   redirect2");

        response.setStatus(302);
//        response.setHeader("Location","http://localhost:8080/req_resp/redirect2");
        response.setHeader("Location","https://www.baidu.com");
    }
}
