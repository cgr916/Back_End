package _1_parenthesis_$;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/10/4 - 17:21
 */

/*  最长有效括号子串  (())(
*
*   思路：正逆向结合、栈+索引差（先将 -1 入栈）、
*
* */

public class LongestValidParentheses {
    public static void main(String[] args) {

    }

    public int longestValidParentheses(String s) {
        int len = s.length(), maxLen = 0;
        int r = 0,l = 0;
        for (int i = 0; i < len; ++i) {
            if(s.charAt(i) == '(') l++;
            else r++;
            if(l == r) maxLen = Math.max(maxLen,l*2);
            else if(r>l){
                l=0;
                r=0;
            }
        }
        l=0;r=0;
        for (int i = len-1; i >= 0; --i) {
            if(s.charAt(i) == '(') l++;
            else r++;
            if(l == r) maxLen = Math.max(maxLen,l*2);
            else if(l>r){
                l=0;
                r=0;
            }
        }
        return maxLen;
    }
}
