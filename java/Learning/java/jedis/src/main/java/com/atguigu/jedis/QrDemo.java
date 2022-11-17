package com.atguigu.jedis;

import redis.clients.jedis.Jedis;

import java.util.Random;

/**
 * @author: cgr
 * @date: 2022/8/2 - 22:02
 */
public class QrDemo {
    public static void main(String[] args) {
        verifyCode("123");
    }

    public static void verifyCode(String phone){
        Jedis jedis = new Jedis("82.156.56.247", 6379);
        jedis.auth("123456");
        String countKey = phone+":count";
        String codeKey = phone+":code";

        String count = jedis.get(countKey);

        if(count == null){
            jedis.setex(countKey,24*60*60,"1");
        }else if(Integer.parseInt(count) <= 2){
            jedis.incr(countKey);
        }else{
            System.out.println("已经超过三次！！！");
            jedis.close();
        }
        jedis.setex(codeKey,120,getCode());
        String code = jedis.get(codeKey);
        System.out.println(phone+":"+code+" : "+count);
        jedis.close();

    }


    public static String getCode(){
        Random random = new Random();
        String qrCode = "";
        for(int i = 0;i < 6;i++){
            qrCode += random.nextInt(10);
        }
        return qrCode;
    }
}
