package com.atguigu.cloud.po;

/**
 * @author: cgr
 * @date: 2022/8/27 - 16:53
 */
public class Son extends Parent{
    public static int sAge = getAge();

    public static int getAge(){
        System.out.println("4");
        return 1;
    }

    static {
        System.out.println("5");
    }

    Son(){
        System.out.println("6");
    }
}
