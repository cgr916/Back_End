package com.atguigu.intf;

/**
 * @author: cgr
 * @date: 2022/11/15 - 23:25
 */
public class Son extends Parent implements ParentIntf{
    public static void main(String[] args) {
        Son.test1();
        Son son = new Son();
        System.out.println(son.test2());
    }

    public static void test1() {
        System.out.println("test1-son");
    }

    public int test2() {
        System.out.println("test2-son");
        return 2;
    }
}
