package com.atguigu.proj.team.domain;

/**
 * @author: cgr
 * @date: 2022/5/3 - 20:31
 */
public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}
