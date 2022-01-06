package com.atguigu.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: cgr
 * @date: 2021/12/30 - 15:05
 */

@Component
@ConfigurationProperties(prefix = "car")
public class Car {
    private String brand;
    private Integer price;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }
}
