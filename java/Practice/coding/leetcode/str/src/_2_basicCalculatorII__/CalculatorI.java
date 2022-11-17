package _2_basicCalculatorII__;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/10/12 - 13:51
 */

/*
*  注意点：注意存储符号
*
*
* */

public class CalculatorI {
    public static void main(String[] args) {
        String s = " ab cd e f ";
//        String trim = s.trim();
        System.out.println(s);
        System.out.println(s.replaceAll(" ", ""));
    }

    public int calculate(String s) {
        String trim = s.replaceAll(" ","");
        int index = 0, len = trim.length(),res = 0;
        char sign = '+';
        Deque<Integer> stack = new LinkedList<>();
        while (index < len){
            res = 0;
            if(trim.charAt(index) == '('){
                char begin = trim.charAt(++index);
                if(begin == '-' || begin == '+'){
                    sign = begin;
                    begin = trim.charAt(++index);
                }
                char tmp = begin;
                while (index < len && Character.isDigit(tmp)) {
                    res = res * 10 + tmp-'0';
                    tmp = s.charAt(++index);
                }

            }else {

            }
            switch (sign){

            }
        }
        return res;
    }
}
