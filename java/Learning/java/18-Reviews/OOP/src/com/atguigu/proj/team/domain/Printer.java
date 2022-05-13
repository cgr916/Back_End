package com.atguigu.proj.team.domain;

/**
 * @author: cgr
 * @date: 2022/5/3 - 20:42
 */
public class Printer implements Equipment{
    private String name;
    private String type;

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return this.name + ':' + this.type;
    }
}
