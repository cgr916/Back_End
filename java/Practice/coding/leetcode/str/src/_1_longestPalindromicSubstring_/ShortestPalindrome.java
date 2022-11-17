package _1_longestPalindromicSubstring_;

import java.util.Arrays;

/**
 * @author: cgr
 * @date: 2022/10/4 - 22:24
 */


/*  在字符串前添加字符使其为最短的回文子串，
*   最后一个next数组对应的数
*
* */

public class ShortestPalindrome {
    public static void main(String[] args) {
        String s = "abcdf";
        String[] strings = s.split("");
        StringBuffer buffer = new StringBuffer(s);
    }

    public String shortestPalindrome(String s) {
        int n = s.length();
        int[] fail = new int[n];
        Arrays.fill(fail, -1);

        for (int i = 1; i < n; ++i) {
            int j = fail[i - 1];
            while (j != -1 && s.charAt(j + 1) != s.charAt(i)) {
                j = fail[j];
            }
            if (s.charAt(j + 1) == s.charAt(i)) {
                fail[i] = j + 1;
            }
        }

        int best = -1;
        for (int i = n - 1; i >= 0; --i) {
            while (best != -1 && s.charAt(best + 1) != s.charAt(i)) {
                best = fail[best];
            }
            if (s.charAt(best + 1) == s.charAt(i)) {
                ++best;
            }
        }
        String add = (best == n - 1 ? "" : s.substring(best + 1));
        StringBuffer ans = new StringBuffer(add).reverse();
        ans.append(s);
        return ans.toString();
    }

}
