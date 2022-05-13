package com.atguigu.exer;

/**
 * @author: cgr
 * @date: 2022/4/14 - 21:40
 */
public class MyThreads {
    public static void main(String[] args) throws InterruptedException {
        ThreadTest1 threadTest1 = new ThreadTest1();
        ThreadTest2 threadTest2 = new ThreadTest2();

        threadTest1.start();
        new Thread(threadTest2).start();
        for(int i = 0;i<100;i++){
            if(i % 3 == 0){
                System.out.println( Thread.currentThread().getName()+" : 3的倍数:"+ i+"---------");
            }
            if(i == 9){
                threadTest1.join();
            }
        }


    }
}

class ThreadTest1 extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if(i % 2 != 0){
                System.out.println("奇数:"+ i+"---------");
            }
            try{
                sleep(100);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }


            if(i%31 == 0){
                yield();
            }
        }
    }
}

class ThreadTest2 implements Runnable{
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            if(i % 2 == 0){
                System.out.println("偶数:"+ i+"*********");
            }
            if(i%20 == 0){
                Thread.yield();
            }
        }
    }
}
