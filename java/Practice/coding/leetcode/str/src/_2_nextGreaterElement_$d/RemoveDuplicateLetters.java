package _2_nextGreaterElement_$d;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/16 - 9:47
 */


/* 去除重复字母使得字典序最小的无重复子序列  bcadcd  bcad
*   思路：遍历 s 中各个字符，
*           通过访问数组 vis 存储访问状态、
*           通过数目数组 num 记载各字符数目
*           只要没被访问，就取 buffer 中最后一个字符与当前访问字符对比
*           如果较大：则删除，并设置可访问
*           如果较小，则直接插入，并设置不可访问；
*
*   注意点：注意判别 尾字符 与 当前字符 时需要 《循环》 判别
* */
public class RemoveDuplicateLetters {
    public static void main(String[] args) {
        Deque<Character> stack = new LinkedList<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.remove('c');
        for (Character character : stack) {
            System.out.println(character);
        }

    }

    public String removeDuplicateLetters(String s) {
        /*int[] chars = new int[26];
        int len = s.length();
        Deque<Character> stack = new LinkedList<>();
        for (char c : s.toCharArray()) {
            chars[c-'a']++;
        }
        for (int i=25;i>=0;--i){
            if(chars[i]>0) stack.push((char)('a'+i));
        }

        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < len; ++i) {
            if (chars[s.charAt(i)-'a'] == 1) {
                if(stack.contains(s.charAt(i))){
                    buffer.append(s.charAt(i));
                    stack.remove(s.charAt(i));
                }
            }else{
                if(stack.isEmpty()) return buffer.toString();
                if(s.charAt(i)==stack.peek()){
                    buffer.append(stack.pop());
                }else {
                    if (chars[s.charAt(i + 1) - 'a'] == 1 && s.charAt(i) < s.charAt(i + 1)) {
                        if(stack.contains(s.charAt(i))){
                            buffer.append(s.charAt(i));
                            stack.remove(s.charAt(i));
                        }
                    }
                }
            }
            chars[s.charAt(i)-'a']--;
        }
        return buffer.toString();*/

        boolean[] vis = new boolean[26];
        int[] num = new int[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            num[s.charAt(i) - 'a']++;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (!vis[ch - 'a']) {
                while (sb.length() > 0 && sb.charAt(sb.length() - 1) > ch) {
                    if (num[sb.charAt(sb.length() - 1) - 'a'] > 0) {
                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length() - 1);
                    } else {
                        break;
                    }
                }
                vis[ch - 'a'] = true;
                sb.append(ch);
            }
            num[ch - 'a'] --;
        }
        return sb.toString();
    }

}
