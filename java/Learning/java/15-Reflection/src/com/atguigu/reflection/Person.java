package com.atguigu.reflection;

/**
 * @author: cgr
 * @date: 2022/4/13 - 21:33
 */
public class Person extends Creature implements Comparable{
    private int age;
    private int id;
    public String name;

    public Person(){

    }

    private Person(int age){
        this.age = age;
    }

    private Person(String name){
        this.name = name;
    }

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    private void showInfo(){
        System.out.println(this.name + "年龄为" + this.age);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
