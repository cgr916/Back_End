package com.atguigu.exer;

/**
 * @author: cgr
 * @date: 2022/4/15 - 17:35
 */
public class Products {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer producer = new Producer(clerk);
        Customer customer = new Customer(clerk);

        producer.setName("生产者-");
        customer.setName("消费者-");

        producer.start();
        customer.start();
    }

}

class Producer extends Thread {
    private Clerk clerk;
    Producer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            clerk.createProducts();
        }
    }
}

class Customer extends Thread{
    private Clerk clerk;

    Customer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            clerk.consumeProducts();
        }
    }
}

class Clerk{
    private int productNum = 0;


    public void consumeProducts() {
        if (productNum <= 20) {
            System.out.println("进行了生产, "+"当前商品数目："+productNum);
            productNum++;
        }else{
            return;
        }
    }

    public void createProducts() {
        if(productNum > 0){
            System.out.println("进行了消费, "+"当前商品数目："+productNum);
            productNum--;
        }else{
            return;
        }
    }
}
