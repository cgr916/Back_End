package com.atguigu.bean;

/**
 * @author: cgr
 * @date: 2022/5/22 - 10:30
 */
public class Users {
    private String userName;
    private String password;
    private String sex;
    private String info;

    public Users() {
    }

    public Users(String userName, String password, String sex, String info) {
        this.userName = userName;
        this.password = password;
        this.sex = sex;
        this.info = info;
    }

    public String getName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSex() {
        return sex;
    }

    public String getInfo() {
        return info;
    }

    public void setName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
