package com.atguigu.cloud.api;

import com.atguigu.cloud.util.ResultEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.concurrent.TimeUnit;

/**
 * @author: cgr
 * @date: 2022/8/5 - 21:02
 */
@FeignClient("member-redis-provider")
public interface RedisProviderRemoteService {
    @RequestMapping("/provider/redis/setKeyValue")
    ResultEntity<String> setRedisKeyValue(
            @RequestParam("key") String key,
            @RequestParam("value") String value);

    @RequestMapping("/provider/redis/setRedisKeyValueWithTimeout")
    ResultEntity<String> setRedisKeyValueWithTimeout(
            @RequestParam("key") String key,
            @RequestParam("value") String value,
            @RequestParam("time") long time,
            @RequestParam("timeUnix") TimeUnit timeUnit);

    @RequestMapping("/provider/redis/getRedisStringValueByKey")
    ResultEntity<String> getRedisStringValueByKey(@RequestParam("key") String key);

    @RequestMapping("/provider/redis/removeRedisKey")
    ResultEntity<String> removeRedisKey(@RequestParam("key") String key);
}
