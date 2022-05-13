package com.atguigu.multithread;

/**
 * @author: cgr
 * @date: 2022/4/15 - 17:19
 */
public class PrintNumber {
    public static void main(String[] args) {
        Add add = new Add();
        Thread thread1 = new Thread(add);
        Thread thread2 = new Thread(add);

        thread1.setName("线程1");
        thread2.setName("线程2");

        thread1.start();
        thread2.start();
    }
}

class Add implements Runnable{
    private int num  = 0;

    @Override
    public void  run() {
        while (true){
            synchronized (this) {
                notify();
                if (num <= 100) {
                    System.out.println(Thread.currentThread().getName()+": "+num);
                    num++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }

            }
        }
    }
}
