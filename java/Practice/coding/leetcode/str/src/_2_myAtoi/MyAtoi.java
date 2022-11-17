package _2_myAtoi;

/**
 * @author: cgr
 * @date: 2022/9/14 - 11:01
 */

// medium

/* 字符串转整数   -4396 wit   ==>> -4396
*   思路：获取整数时分+-符号进行
*   注意点：int型数在 *10  或 /10 过程不会越界，因此要对该情况进行判别
*           获取完后也要进行收尾判别
*
* */
public class MyAtoi {
    public static void main(String[] args) {
//        System.out.println(Integer.MAX_VALUE+1);
//        System.out.println(Integer.MIN_VALUE/10);
//        System.out.println(-Integer.MAX_VALUE>1);
//        System.out.println(-214748363*10-7);
        System.out.println(-614748364*10);
        System.out.println(614748364*10);
//        System.out.println(-2147483647+10);
    }

    public int myAtoi(String s) {
        String str = s.trim();
        int len = str.length();
        int i = 0, res = 0;
        char sign = '+';
        while (i<len){
            if(str.charAt(i) == '+'|| str.charAt(i)=='-'){
                sign = str.charAt(i);
            }else if(Character.isDigit(str.charAt(i))){
                res = getInt(str,i);
                break;
            }else if(str.charAt(i) == ' ') break;
            i++;
        }
        if(sign=='-') return -res;
        else return res;
    }

    public int getInt(String str, int index) {
        int len = str.length();
        int res = 0;
        while (index<len){
            if(Character.isDigit(str.charAt(index))){
                res = res*10+(str.charAt(index)-'0');
                if(res<0){
                    res = Integer.MAX_VALUE;
                    break;
                }
                index++;
            }else break;
        }
        return res;
    }

}
