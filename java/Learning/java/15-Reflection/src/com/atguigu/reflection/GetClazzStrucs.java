package com.atguigu.reflection;

import org.junit.Test;

import java.lang.reflect.Field;

/**
 * @author: cgr
 * @date: 2022/5/9 - 21:40
 */
public class GetClazzStrucs {

    @Test
    public void test(){
        //获取所有属性结构
        Class clazz = Person.class;
        // 获取public属性
//
        //获取所有不含父类中的属性
        Field[] declaredField = clazz.getDeclaredFields();
        for (Field field:declaredField){
            System.out.println(field);
        }
    }

}
