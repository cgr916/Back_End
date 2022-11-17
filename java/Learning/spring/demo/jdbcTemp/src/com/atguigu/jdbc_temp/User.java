package com.atguigu.jdbc_temp;

/**
 * @author: cgr
 * @date: 2022/5/14 - 16:38
 */
public class User {
    private int userId;
    private String userName;
    private int userAge;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}
