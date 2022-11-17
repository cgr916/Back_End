package _2_simplifyPath;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/14 - 14:28
 */

// medium

/*  简化路径：./../a/b/c///   ==>> /a/b/c
*   思路：将除 / 外的字符进行存储;..则弹出
*   用队列可能更好
*
* */

public class SimplifyPath {
    List<String> list = new ArrayList<>();
    public static void main(String[] args) {
        SimplifyPath s = new SimplifyPath();
//        String s2 = s.simplifyPath("/a//b////c/d//././/..");
        String str = "/a//b////c/d//././/..";
        Deque<String> queue = new LinkedList<>();
        String[] list = str.split("/");
        for (String s1 : list) {
//            System.out.print(s1+"-");
            if(s1.equals("..")){
                if (!queue.isEmpty()) queue.pollLast();
            }else if(s1.equals("") || s1.equals(".")) continue;
            else queue.offer(s1);
        }
        for (String s1 : queue) {
            System.out.println(s1);
        }

    }

    public String simplifyPath(String path) {
//        List<String> list = new ArrayList<>();
        list.add("/");
        int len = path.length();
        int i = 1,j=0;
        Deque<String> stack = new LinkedList<>();
        StringBuffer buffer = new StringBuffer();
        while (i<len){
            if(path.charAt(i)=='/'){
                i++;
                if(buffer.length() != 0){
                    list.add(buffer.toString());
                    buffer.delete(0,buffer.length());
                }
            }else{
                buffer.append(path.charAt(i));
                i++;
            }
        }
        if(buffer.length()!=0) list.add(buffer.toString());
        int size = list.size();
        for(int m = 0;m<size;++m){
            if (list.get(m).equals("..")) {
                if(!stack.isEmpty()) stack.pop();
                else {
                    stack.push("/");
                    break;
                }
            }else if(!list.get(m).equals(".")){
                stack.push(list.get(m));
            }
        }
        List<String> strs = new ArrayList<>(stack);
        int s = strs.size();
        StringBuffer buf = new StringBuffer();
        for (int n = s-1;n>=0;--n){
            buf.append(strs.get(n));
            buf.append("/");
        }
        buf.deleteCharAt(0);
        buf.deleteCharAt(buf.length()-1);
        return buf.toString();
    }

}
