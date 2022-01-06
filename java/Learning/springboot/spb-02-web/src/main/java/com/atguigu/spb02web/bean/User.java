package com.atguigu.spb02web.bean;

/**
 * @author: cgr
 * @date: 2021/12/31 - 15:52
 */

public class User {
    private String sname;
    private  Integer sage;

    public String getSname() {
        return sname;
    }
    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }

    public User() {
    }

    public User(String sname, Integer sage) {
        this.sname = sname;
        this.sage = sage;
    }
}
