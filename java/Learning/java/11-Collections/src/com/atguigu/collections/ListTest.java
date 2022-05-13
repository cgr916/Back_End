package com.atguigu.collections;

import org.junit.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 * @author: cgr
 * @date: 2022/4/10 - 22:14
 */
public class ListTest {

    @Test
    public void test1(){
        Collection arrList = new ArrayList();
        Collection arrList1 = new ArrayList();

        //add
        arrList.add("aa");
        arrList.add("bb");
        arrList.add(123);
        arrList.add(new Date());
        arrList1.add("cc");
        arrList1.add(12);

        //size
        System.out.println(arrList.size());

        //addAll
        arrList.addAll(arrList1);
        System.out.println(arrList);

        //clear
        arrList.clear();

        //isEmpty
        System.out.println(arrList.isEmpty());

        //contains
        System.out.println(arrList.contains(123));
        System.out.println(arrList.contains("adf"));


        //containsAll
        System.out.println(arrList.containsAll(arrList1));

        //remove
        System.out.println(arrList.remove(123));

        //removeAll


        //retainAll


        //hashCode


        //toArray ,  Array.asList


        //iterator
        Iterator iterator = arrList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        int[] arr = [1,2,3,4];
    }

    @Test
    public void test2(){
        StringBuffer sb = new StringBuffer();
        String s1 = "abc";//字面量的定义方式
        String s2 = "abc";
        String s3 = new String("abc");
        s1 = "hello";
//        s3 = "hello";
        System.out.println(s1 == s2);//比较s1和s2的地址值
        System.out.println(s2 == s3);

        System.out.println(s2);
    }


    @Test
    public void arrayListTest(){
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add("2");
        System.out.println(al);

        al.remove("2");
        System.out.println(al);
    }
}
