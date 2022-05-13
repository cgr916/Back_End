package com.atguigu.netpro.factors;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author: cgr
 * @date: 2022/4/21 - 16:19
 */
public class IpTest {
    public static void main(String[] args) {
//        new InetSocketAddress().getAddress()
        try {
            InetAddress ipName = InetAddress.getByName("www.baidu.com");
            System.out.println(ipName);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
