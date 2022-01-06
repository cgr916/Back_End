package com.atguigu.boot.bean;

/**
 * @author: cgr
 * @date: 2021/12/8 - 18:28
 */
public class Pet {
    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Pet() {
    }

    public Pet(String type) {
        this.type = type;
    }
}
