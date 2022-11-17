package com.atguigu.cloud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: cgr
 * @date: 2022/8/6 - 10:34
 */
@Configuration
public class MemberWebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        String urlPath = "/member/register.html";
        String viewName = "member-reg";

        registry.addViewController(urlPath).setViewName(viewName);
    }
}
