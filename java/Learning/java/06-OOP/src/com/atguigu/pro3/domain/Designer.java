package com.atguigu.pro3.domain;

/**
 * @author: cgr
 * @date: 2022/4/9 - 10:40
 */
public class Designer extends Programmer {
    private double bonus;

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public Designer() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
