package com.hm.juc.threadPool;

/**
 * @author: cgr
 * @date: 2022/10/7 - 22:31
 */
@FunctionalInterface
public interface RejectPolicy<T> {
    void reject(BlockedQueue<T> queue,T task);
}
