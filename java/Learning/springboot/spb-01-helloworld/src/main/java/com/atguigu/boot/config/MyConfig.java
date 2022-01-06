package com.atguigu.boot.config;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: cgr
 * @date: 2021/12/9 - 11:38
 */

@Configuration(proxyBeanMethods = true)
public class MyConfig {
    @Bean("users")
    public User user01(){
        User zs = new User("jerry", 8);
        zs.setPet(tomcat());
        return zs;

    }

    @Bean("tom")
    public Pet tomcat(){
        return new Pet("tomcat");
    }
}
