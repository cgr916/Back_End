package com.atguigu.reflection;

import java.io.Serializable;

/**
 * @author: cgr
 * @date: 2022/5/9 - 21:51
 */
public class Creature implements Serializable {
    private double weight;
    public char gender;

    private void breath(){
        System.out.println("Breathe");
    }

    public void eat(){
        System.out.println("Need sth. to eat");
    }
}
