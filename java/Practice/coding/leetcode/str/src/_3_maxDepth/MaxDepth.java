package _3_maxDepth;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/9 - 10:38
 */

// easy

/*  有效字符串括号最大深度   (1+(2*(3+4)))  3
*   思路：只需要管 ( 与 )即可
*
* */

public class MaxDepth {
    public static void main(String[] args) {

    }

    public int maxDepth(String s) {
        Deque<Character> stack = new LinkedList<>();
        int len = s.length();
        int depth =  0;
        for (int i = 0;i<len;++i){
            if(s.charAt(i)=='(') stack.push(s.charAt(i));
            if(s.charAt(i)==')'){
                int size = stack.size();
                depth = Math.max(depth,size);
                stack.pop();
            }
        }
        return depth;
    }
}
