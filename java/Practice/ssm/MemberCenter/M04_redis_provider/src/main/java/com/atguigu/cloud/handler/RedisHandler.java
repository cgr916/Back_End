package com.atguigu.cloud.handler;

import com.atguigu.cloud.util.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author: cgr
 * @date: 2022/8/5 - 21:29
 */
@RestController
public class RedisHandler {

    @Autowired
    StringRedisTemplate redisTemplate;

    @RequestMapping("/provider/redis/setKeyValue")
    ResultEntity<String> setRedisKeyValue(
            @RequestParam("key") String key,
            @RequestParam("value") String value) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        try {
            ops.set(key,value);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/redis/setRedisKeyValueWithTimeout")
    ResultEntity<String> setRedisKeyValueWithTimeout(
            @RequestParam("key") String key,
            @RequestParam("value") String value,
            @RequestParam("time") long time,
            @RequestParam("timeUnix") TimeUnit timeUnit) {
        System.out.println("----------redis--------");
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        try {
            ops.set(key,value,time,timeUnit);
            return ResultEntity.successWithoutData();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/redis/getRedisStringValueByKey")
    ResultEntity<String> getRedisStringValueByKey(@RequestParam("key") String key) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        try {
            String s = ops.get(key);
            return ResultEntity.successWithData(s);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultEntity.failed(e.getMessage());
        }
    }

    @RequestMapping("/provider/redis/removeRedisKey")
    ResultEntity<String> removeRedisKey(@RequestParam("key") String key) {
        return null;
    }
}
