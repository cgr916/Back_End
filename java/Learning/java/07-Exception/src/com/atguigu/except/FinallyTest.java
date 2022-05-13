package com.atguigu.except;

import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/4/2 - 21:46
 */
public class FinallyTest {

    @Test
    public void test(){
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println(e);
        }finally {
            System.out.println("finally测试");
        }
    }
}
