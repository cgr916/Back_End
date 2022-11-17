package com.hm;

import java.util.ArrayList;

/**
 * @author: cgr
 * @date: 2022/10/6 - 21:42
 */
class ThreadUnsafe {
    public static void main(String[] args) {
        ThreadSafeSubClass test = new ThreadSafeSubClass();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                test.method1(200);
            }, "Thread" + i).start();
        }
    }
    public final void method1(int loopNumber) {
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < loopNumber; i++) {
            method2(list);
            method3(list);
        }
    }
    private void method2(ArrayList<String> list) {
        list.add("1");
    }
    public void method3(ArrayList<String> list) {
        list.remove(0);
    }
}

class ThreadSafeSubClass extends ThreadUnsafe{

    public void method3(ArrayList<String> list) {
        new Thread(() -> {
            list.remove(0);
        }).start();
    }
}