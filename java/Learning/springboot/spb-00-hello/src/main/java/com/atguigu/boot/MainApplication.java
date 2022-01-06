package com.atguigu.boot;

import com.atguigu.boot.bean.Animal;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: cgr
 * @date: 2021/12/30 - 11:23
 */

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        /* 查看容器中所有组件 */
        String[] names = run.getBeanDefinitionNames();
        System.out.println("=========");
        for (String name:names){
            System.out.println(name);
        }

        /* 获取容器中的组件 */
//        Animal tomcat = run.getBean("tom",Animal.class);
//        User user01 = run.getBean("user", User.class);
//        run.getBean(MyConfig.class);
    }
}
