package _2_nextGreaterElement_$d;

/**
 * @author: cgr
 * @date: 2022/9/15 - 21:39
 */


/*  交错字符串 ==>>>  s1 s2  s3 >>> s3由s1，s2交错合并成s3
*   思路：动态规划==>s(i,j) ==> s(i-1,j) 且s1的第i个字符与s3的第i+j个字符相等
*                             或 s(i,j-1) 且s2的第j个字符与s3的第i+j个字符相等
*   注意点：转换成一维数组来存储时，可以通过顺序，即是
*           i判断在前，j判断在后，
*           且 j 是满足一种情况即可通过
*
* */
public class IsInterleave {
    public static void main(String[] args) {

    }

    public boolean isInterleave(String s1, String s2, String s3) {
        int n = s1.length(), m = s2.length(), t = s3.length();

        if (n + m != t) {
            return false;
        }

        boolean[] f = new boolean[m + 1];

        f[0] = true;
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= m; ++j) {
                int p = i + j - 1;
                if (i > 0) {
                    f[j] = f[j] && s1.charAt(i - 1) == s3.charAt(p);
                }
                if (j > 0) {
                    f[j] = f[j] || (f[j - 1] && s2.charAt(j - 1) == s3.charAt(p));
                }
            }
        }

        return f[m];
    }
}
