package com.atguigu.test;

/**
 * @author: cgr
 * @date: 2022/9/20 - 9:49
 */
public class Parent {
    public int age;
    public static String name;
    static {
        System.out.println(1);
    }
    Parent(){
        System.out.println(3);
    }

    {
        System.out.println(2);
    }

    public void eat(){

    }
}
