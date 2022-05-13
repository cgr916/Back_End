package com.atguigu.pro3.service;

/**
 * @author: cgr
 * @date: 2022/4/9 - 10:34
 */
public class Status {
    private final String NAME;

    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VACATION = new Status("VACATION");

    public Status(String NAME) {
        this.NAME = NAME;
    }

    public String getNAME() {
        return NAME;
    }
}
