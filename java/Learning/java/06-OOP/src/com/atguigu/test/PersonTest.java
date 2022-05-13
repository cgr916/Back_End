package com.atguigu.test;

/**
 * @author: cgr
 * @date: 2022/3/30 - 13:02
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Tommy";
        p1.age = 8;
        p1.sex = true;

        p1.study();

        p1.showAge();

        p1.addAge(2);
    }
}
