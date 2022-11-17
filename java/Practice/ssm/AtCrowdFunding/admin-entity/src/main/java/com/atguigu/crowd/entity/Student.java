package com.atguigu.crowd.entity;

import java.util.Map;

/**
 * @author: cgr
 * @date: 2022/7/16 - 15:12
 */
public class Student {
    private String sName;
    private int sId;
    private  String desc;
    private Map<String,Integer> subject;

    public Student() {
    }

    public Student(String sName, int sId, String desc, Map<String, Integer> subject) {
        this.sName = sName;
        this.sId = sId;
        this.desc = desc;
        this.subject = subject;
    }

    public String getsName() {
        return sName;
    }

    public int getsId() {
        return sId;
    }

    public String getDesc() {
        return desc;
    }

    public Map<String, Integer> getSubject() {
        return subject;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setSubject(Map<String, Integer> subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sName='" + sName + '\'' +
                ", sId=" + sId +
                ", desc='" + desc + '\'' +
                '}';
    }
}
