package com.atguigu.pro3.service;

/**
 * @author: cgr
 * @date: 2022/4/9 - 13:05
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -338751629948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
