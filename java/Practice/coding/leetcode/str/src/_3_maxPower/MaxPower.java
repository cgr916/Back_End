package _3_maxPower;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/9 - 10:54
 */

// easy

/*  连续字符串  abcccccdddeeeeff  ccccc   ==>>> 5
*   思路：char存储当前字符，curCnt存储数目 max为最大值
*
* */

public class MaxPower {
    public static void main(String[] args) {

    }

    public int maxPower(String s) {
        Deque<Character> stack = new LinkedList<>();
        int len = s.length();
        int power = 1;
        stack.push(s.charAt(0));
        for(int i=1;i<len;++i){
            if(s.charAt(i)==stack.peek()) stack.push(s.charAt(i));
            else{
                int size = stack.size();
                power = Math.max(power,size);
                stack.clear();
                stack.push(s.charAt(i));
            }
        }
        power = Math.max(stack.size(),power);
        return power;
    }
}
