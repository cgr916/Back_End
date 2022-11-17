package com.atguigu.commonclass;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author: cgr
 * @date: 2022/7/6 - 11:57
 * @description: Scanner类
 */
public class ScannerTest {
    public static void main(String[] args) {

    }

    @Test
    public void test1(){
        Scanner scanner = new Scanner(System.in);//系统输入作为扫描对象

        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}
