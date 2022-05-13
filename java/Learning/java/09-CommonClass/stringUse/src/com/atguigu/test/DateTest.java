package com.atguigu.test;

import org.junit.Test;

import java.util.Date;

/**
 * @author: cgr
 * @date: 2022/4/8 - 15:42
 */
public class DateTest {

    @Test
    public void test(){
        Date date1 = new Date();

        System.out.println(date1.toString());

        System.out.println(date1.getTime());

        Date date2 = new Date(2838810238L);
        System.out.println(date2.toString());
        System.out.println(date2.getTime());


    }
}
