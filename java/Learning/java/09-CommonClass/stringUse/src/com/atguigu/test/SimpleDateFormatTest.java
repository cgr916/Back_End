package com.atguigu.test;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: cgr
 * @date: 2022/4/10 - 15:19
 */
public class SimpleDateFormatTest {
    @Test
    public void test() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();

        Date date = new Date();

        System.out.println(date);

        System.out.println(sdf.format(date));

        String str = "22-4-10 下午3:20";
        System.out.println(sdf.parse(str));

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
        System.out.println(sdf1.format(date));
        System.out.println(sdf1.parse(sdf1.format(date)).getTime());
    }
}
