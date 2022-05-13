package com.atguigu.pro2.myself;

import java.util.Scanner;

/**
 * @author: cgr
 * @date: 2022/4/8 - 18:01
 */
public class CMUtility {
    private static Scanner scanner = new Scanner(System.in);


    private static String readKeyBoard(int len){
        String line = "";
        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if(line.length() == 0){

            }else if(line.length() < len){
                break;
            }
        }
        return line;
    }
}
