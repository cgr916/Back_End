package com.atguigu.except;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Date;
import java.util.Scanner;

/**
 * @author: cgr
 * @date: 2022/4/2 - 20:50
 */
public class ExceptionTest {
    //NullPointerException
//    @Test
//    public void npe(){
//        String str = "abc";
//        str = null;
//        System.out.println(str.charAt(0));
//    }
//
//    //ArrayIndexOutOfBoundsException
//    @Test
//    public void aie(){
//        int arr[] = new int[10];
//        System.out.println(arr[10]);
//        String str = "abc";
//        System.out.println(str.charAt(3));
//    }
//
//    //ClassCastException
//    @Test
//    public void cce(){
//        Object obj = new Date();
//        String str = (String) obj;
//    }
//
    //NumberFormatException
    @Test
    public void nfe(){
        String str = "qwq";
        int num = Integer.parseInt(str);
    }

    //InputMissCatchException
    @Test
    public void excpt(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
        scanner.close();
    }
}
