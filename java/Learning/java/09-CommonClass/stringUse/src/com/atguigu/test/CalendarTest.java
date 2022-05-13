package com.atguigu.test;

import org.junit.Test;

import java.util.Calendar;

/**
 * @author: cgr
 * @date: 2022/4/10 - 15:46
 */
public class CalendarTest {

    @Test
    public void calendartest(){
        Calendar cl = Calendar.getInstance();
        System.out.println(cl.get(Calendar.DAY_OF_MONTH));
    }



}
