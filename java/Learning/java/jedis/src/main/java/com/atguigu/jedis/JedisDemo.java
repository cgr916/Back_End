package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

/**
 * @author: cgr
 * @date: 2022/8/2 - 19:12
 */
public class JedisDemo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("82.156.56.247", 6379);
        jedis.auth("123456");
        String ping = jedis.ping();
        System.out.println(ping);
    }
}
