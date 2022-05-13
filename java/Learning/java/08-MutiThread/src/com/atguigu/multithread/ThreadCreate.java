package com.atguigu.multithread;

import java.util.Scanner;

/**
 * @author: cgr
 * @date: 2022/4/14 - 20:45
 */
public class ThreadCreate extends Thread {
    public static void main(String[] args) {
        ThreadCreate threadCreate = new ThreadCreate();
        threadCreate.start();
        for(int i = 0;i<100;i++){
            if(i % 2 != 0){
                System.out.println("奇数:"+ i +"**********");
            }
        }
    }

    @Override
    public void run() {
        // 将创建该线程需要执行的操作进行编程
        for(int i = 0;i<100;i++){
            if(i % 2 == 0){
                System.out.println("偶数:"+ i);
            }
        }
    }
}
