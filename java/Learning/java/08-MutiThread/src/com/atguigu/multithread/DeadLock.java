package com.atguigu.multithread;

/**
 * @author: cgr
 * @date: 2022/4/15 - 11:44
 */
public class DeadLock {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        StringBuffer s2 = new StringBuffer();


        new Thread() {
            @Override
            public void run() {
                synchronized (s1) {
                    s1.append(1);
                    s2.append(2);
                    synchronized (s2){
                        s1.append('a');
                        s2.append('b');
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (s1) {
                    s1.append(1);
                    s2.append(2);
                    synchronized (s2){
                        s1.append('a');
                        s2.append('b');
                    }
                }
            }
        }).start();
    }
}
