package com.hm;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: cgr
 * @date: 2022/10/6 - 21:34
 */
public class Test{

    private static int a = 1;
    public static  int b = 2;
    public int c = 3;
    private int d = 4;
    /*public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Thread t1 = new Thread(() -> {
            System.out.println("启动...");
            try {
                Thread.sleep(200);
//                lock.lockInterruptibly();
                lock.lock(); //不可打断
                Thread.sleep(150);
                System.out.println(Thread.currentThread().isInterrupted());
                System.out.println("Thread1-获取了锁");
                int i = 10;
                while (--i > 0) {
                    System.out.println(i);
                }
            } catch (Exception e) {
                System.out.println("出错了");
                System.out.println("Thread1-获取不到锁");
            } finally {
                System.out.println("Thread1-释放了锁1");
                lock.unlock();
                System.out.println("Thread1-释放了锁2");
            }
        }, "t1");
        t1.start();
        try {
            lock.lock();
            System.out.println("main-获得了锁");
            Thread.sleep(2000);
            t1.interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("main-释放了锁");
        }


    }*/
    /*public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();

        Thread t1 = new Thread(() -> {
              System.out.println("启动...");
            if (!lock.tryLock()) {
                System.out.println("获取立刻失败，返回");
                return;
            }
            try {
                System.out.println("t1-获得了锁");
            } finally {
                lock.unlock();
                System.out.println("t1-释放了锁");
            }
        }, "t1");
        t1.start();

        Thread.sleep(100);
        lock.lock();
        System.out.println("main-获得了锁");

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("main-释放了锁");
        }
    }*/

//    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(() -> {
//            System.out.println("start...");
//            try {
//                Thread.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("park...");
//            LockSupport.park();
//            System.out.println("resume...");
//            System.out.println("resume...");
//            System.out.println("resume...");
//            System.out.println("resume...");
//            System.out.println("resume...");
//        },"t1");
//        t1.start();
//        Thread.sleep(2);
//        System.out.println("unpark...");
//        LockSupport.unpark(t1);
//    }

    static volatile boolean run = true;

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        lock.tryLock(1, TimeUnit.HOURS);
        final char[] chars = new char[]{'a', 'b', 'c'};
        chars[1] = 'f';
        System.out.println(chars[1]);
        for (char c : chars) {
            System.out.print(c + "    ");
            System.out.println("--------");
        }

        final AtomicInteger a = new AtomicInteger(1);
        System.out.println(a.addAndGet(2));
//        Consumer<String> con = (v) -> {
//
//        };
////        a.updateAndGet()
//        Thread t = new Thread(()->{
//            try {
//                Thread.sleep(1  );
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(run);
//            while(run){
//                // ....
//                System.out.println(run);
//            }
//            System.out.println(run);
//            System.out.println("退出了");
//        });
//        t.start();
//
//        Thread.sleep(2);
//        run = false; // 线程t不会如预想的停下来
//        System.out.println("修改了");
    }

}
