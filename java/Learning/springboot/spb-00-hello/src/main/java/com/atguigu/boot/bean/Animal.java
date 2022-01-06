package com.atguigu.boot.bean;

/**
 * @author: cgr
 * @date: 2021/12/30 - 11:45
 */
public class Animal {
    private String type;

    public Animal(String type) {
        this.type = type;
    }

    public Animal() {

    }

    public void test(){
        System.out.println(this.type + "is testing......");
    }
}
