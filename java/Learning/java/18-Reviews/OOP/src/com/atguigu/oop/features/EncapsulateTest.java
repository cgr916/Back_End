package com.atguigu.oop.features;

/**
 * @author: cgr
 * @date: 2022/4/12 - 16:21
 */
public class EncapsulateTest {
    private String desc;

    public EncapsulateTest() {
    }

    public EncapsulateTest(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
