package com.hm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: cgr
 * @date: 2022/10/31 - 9:08
 */
public class TestSon extends Test{
    public static void main(String[] args) {
        List<Thread> ts = new ArrayList<>();

        long start = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            int temp = i;
            ts.add(new Thread(() -> {
                System.out.println(temp+":");
            }));
        }
//        ts.forEach(Thread::start);

//        ts.forEach(t -> {
//            try {
//                t.join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
        AtomicReference<String> ar = new AtomicReference<>();
        String prev = ar.get();
        System.out.println(prev);
        System.out.println(ar.compareAndSet(prev, "2"));
        System.out.println(ar.get());
        System.out.println(ar.compareAndSet(new String("2"),"3"));
        System.out.println(ar.compareAndSet("2","3"));
    }

    public void test(){

    }
}
