package com.atguigu.pro2;

/**
 * @author: cgr
 * @date: 2022/3/30 - 22:41
 */
public class Customer {
    String name;
    int age;
    char gender;
    String tel;
    String email;

    public Customer(String name, char gender, int age) {
        this(name, gender, age, "", "");
    }

    public Customer(String name, char gender, int age, String tel, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.tel = tel;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getDetails() {
        return name + "\t" + gender + "\t\t" + age + "\t\t\t" + tel + "\t" + email;
    }
}
