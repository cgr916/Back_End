package com.atguigu.abstr;

/**
 * @author: cgr
 * @date: 2022/4/2 - 11:22
 */
public class AbstractTest {
    public static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person();

    }
}
abstract class Person{

//class Person{
    String name;
    int age;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Student extends Person {
    String id;
    Student() {

    }
}