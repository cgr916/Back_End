package com.atguigu.exer;

import org.junit.Test;

import java.util.Scanner;

/**
 * @author: cgr
 * @date: 2022/5/10 - 22:05
 */
public class Practice {
    @Test
    public void test1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = scanner.nextLine();
        System.out.println("请输入email");
        String email = scanner.nextLine();
        System.out.println("请输入birth");
        String birth = scanner.nextLine();

        String sql = "insert into customers(name,email,birth) values(?,?,?)";
    }

    public int update(String sql, Object... args) {
        

        return 0;
    }
}
