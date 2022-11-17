package _1_parenthesis_$;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/10 - 15:36
 */

// medium

/* 生成有效括号  2  ==>>  ()()  (())
*   思路：回溯，主要利用 '(' 必须先于 ')'
*   先放(，只有 ( 有时才能  放 )
*
*   注意点：放完后记得删除，以便后边右括号的遍历；
*
*   全排列复杂度太高   X
 * */
public class GenerateParenthesis {
    public List<String> lists = new ArrayList<>();
    public List<String> ans = new ArrayList<>();
    public static void main(String[] args) {
        GenerateParenthesis g = new GenerateParenthesis();
        StringBuffer str = new StringBuffer("((()))");

        g.digui(str,0,6);
//        for (String list : g.lists) {
//            System.out.println(list);
//        }

        List<String> list1 = g.getlist(g.lists);
        for (String s : list1) {
            System.out.println(s);
        }
        System.out.println(list1.size());
//        StringBuffer stringBuffer = new StringBuffer("(())()");
//        String string= new String("(())()");
//        System.out.println(string.equals(stringBuffer.toString()));

    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        List<StringBuffer> buffer = new ArrayList<>();
        for(int i = 1;i<=n;++i){
            buffer.add(new StringBuffer(2*n));
        }
        return null;

    }

    public void backtrack(StringBuffer buf,int l,int r,int n){
        if(buf.length()==n*2){
            ans.add(buf.toString());
            return;
        }
        if(l<n){
            buf.append('(');
            backtrack(buf,l+1,r,n);
            buf.deleteCharAt(buf.length()-1);
        }
        if(r<l){
            buf.append(')');
            backtrack(buf,l,r+1,n);
            buf.deleteCharAt(buf.length()-1);
        }
    }



    public List<String> getlist(List<String> list){
        int size = list.size();
        List<String> l = new ArrayList<>();
        l.add(list.get(0));
        for (int i =1;i<size;++i){
            int s =l.size();
            for(int j = 0;j<s;++j){
                if(l.get(j).equals(list.get(i))){
                    break;
                }else {
                    if(j==(s-1)) l.add(list.get(i));
                }
            }
        }
        return l;
    }



    public void digui(StringBuffer sb,int m,int n){
        if(m==n){
//            System.out.println(sb);
            lists.add(sb.toString());
//            getlist(sb);
            return;
        }
        for (int i = m;i<n;++i){
            swap(sb,m,i);
            if(judge(sb.substring(0,m))) digui(sb,m+1,n);
            swap(sb,m,i);
        }
    }

    public void swap(StringBuffer sb,int m,int n){
        char c1 = sb.charAt(m);
        char c2 = sb.charAt(n);
        sb.setCharAt(m,c2);
        sb.setCharAt(n,c1);

    }

    public boolean judge(String sb){
        int m=0,n=0;
        int len = sb.length();
        for(int i = 0;i<len;++i){
            if(sb.charAt(i)=='(') m++;
            else n++;
        }
        return m>=n?true:false;
    }
}
