package com.atguigu.multithread;

import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/4/14 - 22:34
 */
public class StaticTest {

    @Test
    public void ex(){
        Test1 test = new Test1();
        test.t();
    }

}

class Test1{
    String name;

    public static void t(){
        System.out.println("test.........");
    }
}