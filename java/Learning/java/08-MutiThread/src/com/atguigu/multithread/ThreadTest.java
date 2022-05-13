package com.atguigu.multithread;

/**
 * @author: cgr
 * @date: 2022/4/6 - 20:27
 */
public class ThreadTest {
    public static void main(String[] args) {
        TempTest t = new TempTest();
        t.method1("hello1");
    }
}

class TempTest{
    public void method1(String str) {
        System.out.println("method1");
        System.out.println(str);
    }

    public void method2(String str) {
        System.out.println("method2");
        System.out.println(str);
    }
}