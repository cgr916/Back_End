package com.atguigu.proj.team.domain;

/**
 * @author: cgr
 * @date: 2022/5/3 - 20:37
 */
public class PC implements Equipment{
    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    @Override
    public String getDescription() {
        return this.model +':'+ this.display;
    }

}
