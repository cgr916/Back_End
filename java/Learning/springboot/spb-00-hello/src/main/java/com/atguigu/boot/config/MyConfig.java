package com.atguigu.boot.config;

import com.atguigu.boot.bean.Animal;
import com.atguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: cgr
 * @date: 2021/12/30 - 11:39
 */


@Configuration //说明其为 配置类
/*
* @Configuration(proxyBeanMethods = false)
* proxyBeanMethods:代理 Bean 的方法
*                 true：保持组件单实例          Full模式   组件有依赖
*                 false：调用时返回新创建的组件  Lite模式   组件无依赖
* */

@Import(User.class) //注意名字为-->全类名
public class MyConfig {
    @ConditionalOnMissingBean(name = "tim") //条件装配：当容器中有/无   name为tim 的组件时 @Bean注解生效
    @Bean
    public User user(){
        return new User();
    }

    @Bean("tom")
    public Animal animal(){
        return new Animal("cat");
    }

}
