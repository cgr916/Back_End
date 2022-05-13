package com.atguigu.proj;

import java.util.Scanner;

/**
 * @author: cgr
 * @date: 2022/3/26 - 21:08
 */
public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        while(isFlag){
            char selection = Utities.readMenuSelection();
            switch(selection){
                case '1'://收支明细
                        System.out.println();
                    break;
                case '2'://收入
                        System.out.println();
                    break;
                case '3'://支出
                        System.out.println();
                    break;
                case '4'://退出
                        System.out.println();
                    break;
            }
        }
    }


}
