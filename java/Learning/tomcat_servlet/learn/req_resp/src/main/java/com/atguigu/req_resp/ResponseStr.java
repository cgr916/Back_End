package com.atguigu.req_resp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: cgr
 * @date: 2022/5/21 - 10:49
 */
public class ResponseStr extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","text/html;charset=utf-8");

        PrintWriter writer = response.getWriter();
        writer.write("返回的字符：Hello World");
    }
}
