package com.atguigu.boot.bean;

/**
 * @author: cgr
 * @date: 2021/12/8 - 18:28
 */
public class User {
    private String name;
    private  int age;
    private  Pet pet;


    public Pet getPet() {
        return pet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
