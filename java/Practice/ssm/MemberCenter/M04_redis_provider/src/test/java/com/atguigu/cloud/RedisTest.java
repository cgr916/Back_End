package com.atguigu.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: cgr
 * @date: 2022/8/5 - 21:00
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisTemplate<String,String> redisTemplate;

    @Test
    public void testConnection(){
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("test", "测试数据");
        String test = ops.get("test");
        System.out.println("-------*******#######^^^^^^^$$$$$$$&&&&&&&!!!!!!!+++++++");
        System.out.println(test);
    }
}
