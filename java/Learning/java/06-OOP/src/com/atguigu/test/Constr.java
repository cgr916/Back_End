package com.atguigu.test;

/**
 * @author: cgr
 * @date: 2022/3/30 - 21:27
 */
public class Constr {
    String field;
    int num;
    public Constr(int n){
        this.num = n;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getField() {
        return field;
    }
}
