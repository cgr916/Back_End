package com.atguigu.test;

/**
 * @author: cgr
 * @date: 2022/3/30 - 13:11
 */
public class Circle {
    int radius;

    public double circleArea(){
        return Math.PI * radius * radius;
    }
};

class CircleTest{
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 2;
        double a = c1.circleArea();
        System.out.println(a);
    }
}