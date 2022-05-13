package com.atguigu.test;

import org.junit.Test;

import java.util.Locale;

/**
 * @author: cgr
 * @date: 2022/4/7 - 16:51
 */
public class StringMethods {



    @Test
    public void test1(){
        String s0 = " helloWorld";
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.length());

        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(1));

        System.out.println(s1.isEmpty());

        String s2 = s1.toUpperCase();
        System.out.println(s2);
        String s3 = s1.toLowerCase();
        System.out.println(s3);

        String s4 = s0.trim();
        System.out.println(s4);

        System.out.println(s1.endsWith("ld"));
        System.out.println(s1.endsWith("1d"));
        System.out.println(s1.startsWith("he"));
        System.out.println(s1.startsWith("He"));
        System.out.println(s1.startsWith("e", 1));

        System.out.println(s1.contains("ello"));
        System.out.println(s1.contains("L"));

        System.out.println(s1.indexOf("el"));
        System.out.println(s1.indexOf("lo", 3));
        System.out.println(s1.lastIndexOf("or"));
        System.out.println(s1.lastIndexOf("or", 4));//从右往左


    }
}
