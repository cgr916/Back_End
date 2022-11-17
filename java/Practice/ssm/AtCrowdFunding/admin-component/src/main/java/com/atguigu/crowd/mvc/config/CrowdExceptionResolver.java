package com.atguigu.crowd.mvc.config;

import com.atguigu.crowd.exception.LoginException;
import com.atguigu.crowd.util.AjaxResult;
import com.atguigu.crowd.util.CrowdUtil;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: cgr
 * @date: 2022/7/21 - 17:21
 */
@ControllerAdvice
public class CrowdExceptionResolver {
    @ExceptionHandler(value = LoginException.class)
    public ModelAndView resolveCrowdException(LoginException loginException,
                                              HttpServletRequest request,
                                              HttpServletResponse response) throws IOException {
        String viewName = "err";

        return commonResolver(viewName,loginException,request,response);
    }

    private ModelAndView commonResolver(String viewName,
                                       Exception exception,
                                       HttpServletRequest request,
                                       HttpServletResponse response) throws IOException {
        boolean type = CrowdUtil.judgeRequestType(request);
        if(type){
            AjaxResult<Object> result = AjaxResult.failed(exception.getMessage());
            Gson gson = new Gson();
            String s = gson.toJson(result);

            response.getWriter().write(s);

            return null;
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("exception", exception);
        modelAndView.setViewName(viewName);
        return modelAndView;
    }
}
