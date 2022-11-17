package com.atguigu.boot.beans;

/**
 * @author: cgr
 * @date: 2022/7/21 - 11:27
 */
public class Pet {
    private String pType;
    private String petName;

    public Pet() {
    }

    public Pet(String pType, String petName) {
        this.pType = pType;
        this.petName = petName;
    }

    public String getpType() {
        return pType;
    }

    public String getPetName() {
        return petName;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pType='" + pType + '\'' +
                ", petName='" + petName + '\'' +
                '}';
    }
}
