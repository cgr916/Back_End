package com.atguigu.test;

/**
 * @author: cgr
 * @date: 2022/4/7 - 16:23
 */
public class Person {
    String name;
    int age;

    Person(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
