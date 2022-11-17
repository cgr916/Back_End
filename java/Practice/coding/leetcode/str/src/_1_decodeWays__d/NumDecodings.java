package _1_decodeWays__d;

/**
 * @author: cgr
 * @date: 2022/9/2 - 16:40
 */

// medium

/*  字符编码   124 ==>>  1,2,4   12,4  1,24
*   思路：动态规划
*   0   1   2    3
*   1   1   1+1  2+1
*
* */
public class NumDecodings {
    public static void main(String[] args) {
        NumDecodings numDecodings = new NumDecodings();
        int i = numDecodings.numDecodings("123");
        System.out.println(i);
    }

    public int numDecodings(String s) {
        int len = s.length();
        int[] f = new int[len+1];
        f[0] = 1;
        for (int i = 1; i <= len; ++i) {
            if(s.charAt(i-1)!='0') f[i] += f[i-1];
            if(i>1 && s.charAt(i-2)!='0'&& (s.charAt(i-2)-'0')*10+s.charAt(i-1)-'0'<=26) f[i] += f[i-2];
        }
        return f[len];
    }
}
