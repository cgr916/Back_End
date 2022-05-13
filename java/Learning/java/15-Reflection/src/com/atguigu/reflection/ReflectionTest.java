package com.atguigu.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: cgr
 * @date: 2022/4/13 - 21:15
 */
public class ReflectionTest {



    @Test
    public void  test() throws Exception {
        Class clazz = Person.class;
        Constructor cons = clazz.getConstructor( int.class,String.class);

        Object obj = cons.newInstance(12,"Tom");
        Person p = (Person) obj;
        System.out.println(p.toString());
        // 调私有属性
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p,10);
        System.out.println(p.toString());
        // 调私有方法
        Method showInfo = clazz.getDeclaredMethod("showInfo");
        showInfo.setAccessible(true);
        showInfo.invoke(p);



    }

    @Test
    public void createTest() throws ClassNotFoundException {
        // 类的属性
        Class calzz1 = Person.class;

        // 类的方法
        Person p = new Person(1,10,"Tom");
        Class clazz2 = p.getClass();

        // Class的静态方法
        Class clazz3 = Class.forName("com.atguigu.reflection.Person");

    }


}
