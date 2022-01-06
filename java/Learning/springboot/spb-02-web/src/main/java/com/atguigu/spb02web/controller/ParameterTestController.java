package com.atguigu.spb02web.controller;

import org.apache.tomcat.util.http.parser.Cookie;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: cgr
 * @date: 2022/1/5 - 15:43
 */

@RestController
public class ParameterTestController {
    @GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object> getCar(@PathVariable("id") Integer id,
                                     @PathVariable("username") String username,
                                     @PathVariable Map<String, String> pv,
                                     @RequestHeader("User-Agent") String userAgent,
                                     @CookieValue("_ga") String _ga,
                                     @CookieValue("_ga") Cookie cookie
                                     ){
        Map<String,Object> map = new HashMap<>();

        map.put("id", id);
        map.put("name",username);
        map.put("pv",pv);
        return map;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String content){
        Map<String,Object> map = new HashMap<>();
        map.put("content",content);
        return map;
    }


}
