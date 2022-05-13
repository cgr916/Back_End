package com.atguigu.oop.class_members;

/**
 * @author: cgr
 * @date: 2022/4/12 - 16:08
 */
public class ClassMembersTest {
    public static void main(String[] args) {
        System.out.println(ClassMembersTest.desc);
        ClassMembersTest cmt = new ClassMembersTest();
        System.out.println(cmt.name);
    }

    // 属性
    String name;
    static String desc;

    // 构造器
    ClassMembersTest() {

    }

    ClassMembersTest(String name) {
        this.name = name;
    }

    // 方法
    public void test() {
        System.out.println("test");
    }

    // 代码块: 初始化 类/实例对象的 信息
        // 非静态
    {
        name = "123";
    }
        //静态
    static {
        desc = "test";
    }

    // 内部类：该类仅在类内部需要使用
    class Person{
        String name;
        int id;

    }
}

