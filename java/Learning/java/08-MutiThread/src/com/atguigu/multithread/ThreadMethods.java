package com.atguigu.multithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author: cgr
 * @date: 2022/4/14 - 21:46
 */
public class ThreadMethods {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        FutureTask futureTask = new FutureTask(numThread);

        new Thread(futureTask).start();

        try {
            Object sum = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class NumThread implements Callable {
    @Override
    public Object call() throws Exception {
        int num = 0;
        int sum = 0;
        while (num<100){
            if (num % 2 == 0) {
                sum += num;
                System.out.println(num);
            }
            num++;
        }
        return sum;
    }
}
