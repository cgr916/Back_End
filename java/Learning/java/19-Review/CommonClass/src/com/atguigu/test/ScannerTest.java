package com.atguigu.test;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author: cgr
 * @date: 2022/7/6 - 14:57
 * @description: Scanner 类
 */
public class ScannerTest {
    /*
    * 1、Scanner类使用System类作为扫描对象，只能在主线程中进行操作
    * 2、注意hasNext()与hasNextLine()的区别
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入:");
        if(scanner.hasNext()){
            System.out.println("输出：");
            System.out.println(scanner.next());
        }
        scanner.close();
    }


}
