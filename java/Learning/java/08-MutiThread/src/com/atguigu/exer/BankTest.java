package com.atguigu.exer;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author: cgr
 * @date: 2022/4/15 - 11:15
 */
public class BankTest {
    public static void main(String[] args) {
        Bank1 bank = Bank1.getInstance();
    }
}

class Bank1{
    //    int balance;
    private static Bank1 instance = new Bank1();
    private Bank1(){

    }

    public static Bank1 getInstance(){
        return instance;
    }
}

class Bank2{

    private Bank2(){

    }
    private static Bank2 instance = null;
    // 方式1 效率较低
//    public static synchronized Bank2 getInstance(){
//        if(instance == null){
//            instance = new Bank2();
//        }
//        return  instance;
//    }

    //方式2
    public static Bank2 getInstance(){
        synchronized (Bank2.class){
            if(instance == null){
                instance = new Bank2();
            }
        }
        return  instance;
    }
}

