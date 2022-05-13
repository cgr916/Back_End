package com.atguigu.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: cgr
 * @date: 2022/4/15 - 19:47
 */
public class ThreadPools {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.execute(new ExecutorThread());
    }
}

class ExecutorThread extends Thread {
    private int sum = 0;

    @Override
    public void run() {
        int num = 0;
        while (num < 100) {
            if (num % 2 == 0){
                System.out.println(num);
                sum += num;
            }
            num++;
        }
    }

    public int getSum() {
        return sum;
    }
}