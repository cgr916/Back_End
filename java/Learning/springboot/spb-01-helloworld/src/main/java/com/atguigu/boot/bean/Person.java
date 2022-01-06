package com.atguigu.boot.bean;

/**
 * @author: cgr
 * @date: 2021/12/9 - 17:27
 */

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "person")
@Data
public class Person {
    private String userName;
    private Boolean boss;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private Map<String, List<Pet>> allPets;
}
