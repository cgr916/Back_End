package com.atguigu.collections;

import org.junit.Test;

import java.util.HashSet;

/**
 * @author: cgr
 * @date: 2022/4/11 - 14:13
 */
public class SetTest {

    @Test
    public void test(){
        HashSet set = new HashSet();
        set.add(12);
        set.add(34);
        set.add(56);
        String name = "cgr";
        System.out.println(name.charAt(0));
        System.out.println(set.add(56));
    }


}
