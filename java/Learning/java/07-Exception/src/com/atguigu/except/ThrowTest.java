package com.atguigu.except;

/**
 * @author: cgr
 * @date: 2022/4/2 - 22:15
 */
public class ThrowTest {
    public static void main(String[] args) throws Exception {
        ThrowTest t = new ThrowTest();
        t.test(true);
    }

    public void test (boolean flag)throws Exception{
        if(flag){
            String str = "abc";
            System.out.println("ok1");
            int num = Integer.parseInt(str);
            System.out.println(num);
            System.out.println("ok2");
        }else{
            System.out.println("no");
        }
    }
}
