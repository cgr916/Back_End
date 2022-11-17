package com.atguigu.jav;

/**
 * @author: cgr
 * @date: 2022/9/13 - 19:50
 */

/*
*   线程、进程;并发、并行;
*   线程创建：继承Thread、实现Runnable（线程池、实现Callable）
*   线程常用方法（静态方法与普通方法）=>ThreadLocal
*   线程生命周期
*   线程同步：锁
*   锁详解
*   线程通信
*
* */

public class ThreadLearn {
    public static void main(String[] args) {
        ThreadLocal tl = new ThreadLocal();
        /*   ======>>>数据隔离
        *   各线程中的ThreadLocalMap： key:ThreadLocal,value:实际对象
        *   ThreadLocalMap -> WeakReference
        *
        * */

        /*      volatile
        *   指令重排--> volatile禁止指令重排
        *   可见性  --> 线程可见=线程改动数据时其他线程能够“看见”
        *   单次读/写的原子性 CAS
        *   适用场景：双重检查、更新不频繁的情景
        *
        *
        * */



    }
}
