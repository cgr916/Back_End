package com.atguigu.test;

import java.lang.reflect.Field;

/**
 * @author: cgr
 * @date: 2022/9/20 - 9:49
 */
public class Son extends  Parent{
    public static void main(String[] args) throws NoSuchFieldException {
        Son son = new Son();
        Class<Son> sonClass = Son.class;
        for (Field field : sonClass.getFields()) {
            System.out.println(field);
        }

//        System.out.println(Son.name == name);
    }
    public static String name = "test";
    public String skill;
    static {
        System.out.println(4);
    }
    Son(){
        System.out.println(6);
    }

    {
        System.out.println(5);
    }
}
