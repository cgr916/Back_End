package com.atguigu.proj.team.domain;

/**
 * @author: cgr
 * @date: 2022/5/3 - 20:40
 */
public class NoteBook implements Equipment{
    private String model;
    private double price;

    public NoteBook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.model + ':' + this.price;
    }
}
