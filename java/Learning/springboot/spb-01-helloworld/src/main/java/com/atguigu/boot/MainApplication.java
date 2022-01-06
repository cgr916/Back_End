package com.atguigu.boot;

import com.atguigu.boot.bean.Pet;
import com.atguigu.boot.bean.User;
import com.atguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: cgr
 * @date: 2021/12/7 - 22:28
 */
//这是一个springboot应用
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan("com.atguigu.boot")

public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }


        MyConfig bean = run.getBean(MyConfig.class);
        User user = run.getBean(User.class);
        User user01 = bean.user01();
        User user02 = bean.user01();
        Pet pet = bean.tomcat();
        System.out.println("hahhahah-----------------");
        System.out.println(pet == user01.getPet());
//        System.out.println("haha:-----"+user);
    }
}
