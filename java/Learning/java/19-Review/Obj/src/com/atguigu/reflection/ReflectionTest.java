package com.atguigu.reflection;

import org.junit.Test;

import java.util.Random;

/**
 * @author: cgr
 * @date: 2022/7/7 - 15:28
 * @description:反射相关测试
 */
public class ReflectionTest {
    public Object getInstance(String classPath) throws Exception {
        Class clazz =  Class.forName(classPath);
        return clazz.newInstance();
    }

    @Test
    // 测试反射的动态性
    public void test1() {

        for(int i = 0;i < 10;i++){
            int num = new Random().nextInt(3);//0,1,2
            String classPath = "";
            switch(num){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "com.atguigu.java.Person";
                    break;
            }

            try {
                Object obj = getInstance(classPath);
                System.out.println(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
