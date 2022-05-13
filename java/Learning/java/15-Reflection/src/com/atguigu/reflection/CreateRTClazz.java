package com.atguigu.reflection;

import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/5/9 - 21:27
 */
public class CreateRTClazz {

    @Test
    public void test() throws InstantiationException, IllegalAccessException {
        Class<Person> clazz = Person.class;
        // 这是因为该空参构造器权限为public
        //Person p1 = clazz.newInstance(12,"Tom");//报错。不为空参构造器
        Person p1 = clazz.newInstance();
        System.out.println(p1);
    }

    public Object getInstance(String classPath) throws Exception {
        Class clazz = Class.forName(classPath);
        return clazz.newInstance();
    }
}
