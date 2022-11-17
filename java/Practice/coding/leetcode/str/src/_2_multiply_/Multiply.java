package _2_multiply_;

import java.util.Arrays;

/**
 * @author: cgr
 * @date: 2022/9/10 - 9:21
 */

// medium

/*  两字符串相乘   2*3  6
*   思路：关注各位相乘时的位置
*   注意点：数组中各数存放的位置
*           前导零的删除
*           Arrays.toString 与 replaceAll的使用
*
* */
public class Multiply {
    public static void main(String[] args) {

    }

    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] m = new int[len1+len2];
        for(int i = len1-1;i>=0;--i){
            for(int j = len2-1;j>=0;--j){
                m[i + j + 1] += ((num1.charAt(i) - '0') * (num2.charAt(j) - '0'));
            }
        }
        int r=0,c=0;
        for(int i=len1+len2-1;i>=0;--i){
            r = (m[i]+c)%10;
            c = (m[i]+c)/10;
            m[i]=r;
        }
        String str = Arrays.toString(m);
        str.replaceAll("\\[|,|]","").replaceAll(" ","");
        if(str.charAt(0)=='0') return str.substring(1);
        return str;
    }
}
