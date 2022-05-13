package com.atguigu.test;

import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/4/7 - 15:42
 */
public class StringTest {


    @Test
    public void test() {
        Person p1 = new Person("Tom",12);
        Person p2 = new Person("Tom",12);
        System.out.println(p1.name == p2.name);
        System.out.println(p1.age == p2.age);
    }
}
