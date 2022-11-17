package com.atguigu.cloud.handler;

import com.atguigu.cloud.api.RedisProviderRemoteService;
import com.atguigu.cloud.property.MessageProperty;
import com.atguigu.cloud.util.ResultEntity;
import com.atguigu.cloud.util.SendMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

/**
 * @author: cgr
 * @date: 2022/8/6 - 11:25
 */
@Controller
public class ConsumerHandler {

    @Resource
    private MessageProperty messageProperty;

    @Resource
    public RedisProviderRemoteService redisService;

    @RequestMapping("member/handleRegister")
    public String handleRegister(){
        return "index";
    }


    @ResponseBody
    @RequestMapping("/member/register.json")
    public ResultEntity<String> sendMsg(@RequestParam("phoneNum") String phoneNum) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        ResultEntity<String> result = SendMessage.send(messageProperty.getId(),
                messageProperty.getKey(),
                messageProperty.getTag(),
                phoneNum);

        if (result.getResult().equals(ResultEntity.SUCCESS)){
            String key = "Auth_Code_"+phoneNum;
            String data = result.getData();
            System.out.println(data);
            ResultEntity<String> stringResultEntity =
                    redisService.setRedisKeyValueWithTimeout(key, data, 5, TimeUnit.MINUTES);
            if(stringResultEntity.getResult().equals(ResultEntity.SUCCESS)){
                return ResultEntity.successWithoutData();
            }else {
                return stringResultEntity;
            }
        }else{
            return result;
        }

    }
}
