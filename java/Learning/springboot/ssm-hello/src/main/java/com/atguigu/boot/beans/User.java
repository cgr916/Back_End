package com.atguigu.boot.beans;

import lombok.Data;

/**
 * @author: cgr
 * @date: 2022/7/21 - 11:51
 */
@Data
public class User {
    private String uName;
    private Integer uAge;

    public User() {
    }

    public User(String uName, Integer uAge) {
        this.uName = uName;
        this.uAge = uAge;
    }

    public String getuName() {
        return uName;
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "uName='" + uName + '\'' +
                ", uAge=" + uAge +
                '}';
    }
}
