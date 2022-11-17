package com.atguigu.crowd.util;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author: cgr
 * @date: 2022/7/21 - 17:02
 */
public class CrowdUtil {
    public static boolean judgeRequestType(HttpServletRequest request){
        // 1.获取请求消息头信息
        String acceptInformation = request.getHeader("Accept");
        String xRequestInformation = request.getHeader("X-Requested-With");

        return (
                acceptInformation != null
                        &&
                        acceptInformation.length() > 0
                        &&
                        acceptInformation.contains("application/json")
                )
                ||
                (
                        xRequestInformation != null
                                &&
                                xRequestInformation.length() > 0
                                &&
                                xRequestInformation.equals("XMLHttpRequest")
                );
    }



    public static String md5(String source){
        if(source == null || source.length() == 0){
            throw new RuntimeException(CrowdConstant.Login_Pswd_Invalid);
        }else{
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("md5");
                byte[] bytes = source.getBytes();
                byte[] digest = messageDigest.digest(bytes);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } finally {

            }
        }
        return "";
    }
}
