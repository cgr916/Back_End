package com.atguigu.pro3.domain;

import com.atguigu.pro3.service.Status;

/**
 * @author: cgr
 * @date: 2022/4/9 - 10:31
 */
public class Programmer extends Employee{
    private int memberId;
    private Status status;
    private  Equipment equipment;


    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer() {
    }

    public int getMemberId() {
        return memberId;
    }

    public Status getStatus() {
        return status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
