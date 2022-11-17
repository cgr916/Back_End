package com.atguigu.boot.beans;

/**
 * @author: cgr
 * @date: 2022/7/21 - 11:27
 */
public class Person {
    private String pName;
    private Integer pId;
    private String pDesc;

    public Person() {
    }

    public Person(String pName, Integer pId, String pDesc) {
        this.pName = pName;
        this.pId = pId;
        this.pDesc = pDesc;
    }

    public String getpName() {
        return pName;
    }

    public Integer getpId() {
        return pId;
    }

    public String getpDesc() {
        return pDesc;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public void setpDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pName='" + pName + '\'' +
                ", pId=" + pId +
                ", pDesc='" + pDesc + '\'' +
                '}';
    }
}
