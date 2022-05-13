package com.atguigu.reflection;

import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/5/9 - 21:00
 */
public class GetClazz {
    @Test
    public void testGet() throws ClassNotFoundException {
        // method 1
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        // method 2
        Person p = new Person(1,12,"Tom");
        Class clazz2 = p.getClass();
        System.out.println(clazz2);

        // method 3
        Class clazz3 = Class.forName("com.atguigu.reflection.Person");
        System.out.println(clazz3);

        // method 4:classLoader
        ClassLoader clazzLoader = GetClazz.class.getClassLoader();
        Class clazz4 = clazzLoader.loadClass("com.atguigu.reflection.Person");
        System.out.println(clazz4);

        // test
        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz1 == clazz4);
    }


    @Test
    public void testMultiClazz(){
        Class clazz1 = int[][].class;
//        Class clazz2 = int[10].class;
        int[] a = new int[10];
        int[] b = new int[100];
        System.out.println(a.getClass() == b.getClass());
    }
}
