package com.atguigu.boot;

import com.atguigu.boot.beans.Person;
import com.atguigu.boot.beans.Pet;
import com.atguigu.boot.beans.User;
import com.atguigu.boot.config.SpringConfigDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author: cgr
 * @date: 2022/7/21 - 11:35
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

//        String[] names = run.getBeanDefinitionNames();
//
//
//        System.out.println("-----------------");
//        for (String name:names){
//            System.out.println(name);
//        }
//
//        Person person = run.getBean("person", Person.class);
//        Pet pet = run.getBean("pet", Pet.class);
//        System.out.println(pet);
//        System.out.println(person);
//
//        SpringConfigDemo config = run.getBean(SpringConfigDemo.class);
//        Person person1 = config.person();
//        Person person2 = config.person();
//        System.out.println(person2 == person1);
//
//        User user = run.getBean(User.class);
//        System.out.println(user);

    }
}
