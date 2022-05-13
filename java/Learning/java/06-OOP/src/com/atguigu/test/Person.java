package com.atguigu.test;

/**
 * @author: cgr
 * @date: 2022/3/30 - 12:59
 */
public class Person {
    String name;
    int age;
    /**
     * true:男性
     * false:女性
     */
    boolean sex;

    public void study(){
        System.out.println("I can study");
    }

    public void showAge(){
        System.out.println(this.age);
    }

    public int addAge(int num){
        this.age += num;
        System.out.print("当前年龄:"+this.age);
        return age;
    }
}

