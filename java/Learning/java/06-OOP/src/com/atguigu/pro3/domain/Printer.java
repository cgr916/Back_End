package com.atguigu.pro3.domain;

/**
 * @author: cgr
 * @date: 2022/4/8 - 23:04
 */
public class Printer implements Equipment{
    private String model;
    private String display;

    public Printer() {
    }

    public Printer(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public String getDisplay() {
        return display;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDisplay(String display) {
        this.display = display;
    }


    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }

}
