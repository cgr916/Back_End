package com.atguigu.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: cgr
 * @date: 2022/8/2 - 22:46
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate<Object,Object> redisTemplate;

    @Test
    public void redisTemplateTest(){
        ValueOperations<Object, Object> operations = redisTemplate.opsForValue();
        operations.set("redis", "hello redis");
        Object k1 = operations.get("redis");
        System.out.println(k1);
        System.out.println("hello");
    }

}
