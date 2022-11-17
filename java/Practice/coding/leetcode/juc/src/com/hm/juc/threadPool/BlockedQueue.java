package com.hm.juc.threadPool;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: cgr
 * @date: 2022/10/7 - 21:34
 */
public class BlockedQueue<T> {
    // 1. 任务队列
    private Deque<T> queue = new ArrayDeque<>();

    // 2. 锁
    private ReentrantLock lock = new ReentrantLock();

    // 3. 生产者条件变量
    private Condition  taskWaitSet = lock.newCondition();

    // 4. 消费者条件变量
    private Condition threadWaitSet = lock.newCondition();
    ConcurrentHashMap<String, String> hc = new ConcurrentHashMap<>();
    HashMap<String, String> hm = new HashMap<>();
    // 5. 容量
    private int capacity;

    BlockedQueue(int capacity){
        System.out.println("构建阻塞队列");
        this.capacity = capacity;
    }

    // 带超时阻塞获取
    public T poll(long timeout, TimeUnit unit) {
        lock.lock();
        try {
            // 将 timeout 统一转换为 纳秒
            long nanos = unit.toNanos(timeout);
            while (queue.isEmpty()) {
                try {
                    // 返回值是剩余时间
                    if (nanos <= 0) {
                        return null;
                    }
                    nanos = threadWaitSet.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T t = queue.removeFirst();
            taskWaitSet.signal();
            return t;
        } finally {
            lock.unlock();
        }
    }

    // 阻塞获取
    public T take() {
        lock.lock();
        try {
            while (queue.isEmpty()) {
                try {
                    threadWaitSet.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            T t = queue.removeFirst();
            taskWaitSet.signal();
            return t;
        } finally {
            lock.unlock();
        }
    }

    // 阻塞添加
    public void put(T task) {
        lock.lock();
        try {
            while (queue.size() == capacity) {
                try {
                    System.out.println("等待加入任务队列 {"+task+"} ...");
                    taskWaitSet.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("加入任务队列 {"+task+"}");
            queue.addLast(task);
            threadWaitSet.signal();
        } finally {
            lock.unlock();
        }
    }

    // 带超时时间阻塞添加
    public boolean offer(T task, long timeout, TimeUnit timeUnit) {
        lock.lock();
        try {
            long nanos = timeUnit.toNanos(timeout);
            while (queue.size() == capacity) {
                try {
                    if(nanos <= 0) {
                        return false;
                    }
                    System.out.println("等待加入任务队列 {"+task+"} ...");
                    nanos = taskWaitSet.awaitNanos(nanos);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("加入任务队列 {"+task+"}");
            queue.addLast(task);
            threadWaitSet.signal();
            return true;
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        lock.lock();
        try {
            return queue.size();
        } finally {
            lock.unlock();
        }
    }

    public void tryPut(RejectPolicy<T> rejectPolicy, T task) {
        lock.lock();
        try {
            // 判断队列是否满
            if(queue.size() == capacity) {
                System.out.println("队列已满,按照拒绝策略处理任务 {"+task+"}");
                rejectPolicy.reject(this, task);
            } else {  // 有空闲
                System.out.println("队列未满,加入任务队列 {"+task+"}");
                queue.addLast(task);
                threadWaitSet.signal();
            }
        } finally {
            lock.unlock();
        }
    }





}
