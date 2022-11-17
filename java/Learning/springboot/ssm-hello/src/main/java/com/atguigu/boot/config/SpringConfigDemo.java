package com.atguigu.boot.config;

import com.atguigu.boot.beans.Person;
import com.atguigu.boot.beans.Pet;
import com.atguigu.boot.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author: cgr
 * @date: 2022/7/21 - 11:30
 */

@Import({User.class})
@Configuration
public class SpringConfigDemo {

    @Bean
    public Person person(){
        return new Person("Tom", 8, "good");
    }

    @Bean
    public Pet pet(){
        return new Pet("mouse", "Jerry");
    }
}
