package com.atguigu.except;

import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/4/2 - 21:25
 */
public class TryCatchTest {

    @Test
    public void test() {
        try {
            String str = "afew";
            int num = Integer.parseInt(str);
            System.out.println(num);
        }catch (NumberFormatException e){
            System.out.println("异常类型："+ e);
            System.out.println("不要着急");
        }

    }
}
