package com.atguigu.singleton;

/**
 * @author: cgr
 * @date: 2022/4/2 - 10:31
 */
public class SingleTonTest {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        Order order = Order.getInstance();
    }
}
class Bank{
    private Bank(){

    }

    private static Bank instance = new Bank();

    public static Bank getInstance() {
        System.out.println("饿汉式");
        return instance;
    }
}

class Order{
    private Order(){

    }

    private static Order instance = null;

    public static Order getInstance(){
        if(instance == null){
            System.out.println("懒汉式");
            instance = new Order();
        }
        return instance;
    }
}
