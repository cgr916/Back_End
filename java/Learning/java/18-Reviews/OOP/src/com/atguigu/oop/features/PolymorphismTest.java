package com.atguigu.oop.features;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author: cgr
 * @date: 2022/4/12 - 16:24
 */
public class PolymorphismTest {
    @Test
    public void test(){
        int [] arr1 = new int[]{1,2};
        int [] arr2 = new int[]{2,3};
        Arrays.equals(arr1,arr2);
        int[] arr = new int[4];
        long lnum = 3l;
        int a =1;
        Integer b = new Integer(3);
        System.out.println(b+1);
    }


    @Test
    public void test1(){
        String s1 ="abc";
        String s2 ="abc";
        System.out.println(s1 == s2);
        String s3 ="abcDEF";
        String s4 ="abc"+"DEF";
        System.out.println(s3 == s4);
        char i = 0;
        i+='a';
        char temp = i;
        temp+='a';
        System.out.println(i);
        System.out.println();
        System.out.println(Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.charAt(2));
    }
    @Test
    public void test2(){

    }
}
