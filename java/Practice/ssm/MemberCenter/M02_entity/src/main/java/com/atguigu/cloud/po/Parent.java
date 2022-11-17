package com.atguigu.cloud.po;

/**
 * @author: cgr
 * @date: 2022/8/27 - 16:51
 */
public class Parent {
    public static int age = getAge();

    public static int getAge(){
        System.out.println("1");
        return 1;
    }

    static {
        System.out.println("2");
    }

    Parent(){
        System.out.println("3");
    }
}
