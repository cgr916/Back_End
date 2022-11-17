package com.atguigu.demo;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends  HttpServlet{
//public class HelloServlet implements Servlet {
//    @Override
//    public void init(ServletConfig servletConfig) throws ServletException {
//
//    }
//
//    @Override
//    public ServletConfig getServletConfig() {
//        return null;
//    }
//
//    @Override
//    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
//        System.out.println("servlet 被访问了 ");
//        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
//        System.out.println(httpServletRequest.getMethod());
//    }
//
//    @Override
//    public String getServletInfo() {
//        return null;
//    }
//
//    @Override
//    public void destroy() {
//
//    }

    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public void destroy() {
    }

}