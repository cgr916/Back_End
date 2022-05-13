package com.atguigu.expands;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: cgr
 * @date: 2022/5/10 - 19:19
 */


public class ServletTest implements Servlet {

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //专门处理请求和响应的
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
