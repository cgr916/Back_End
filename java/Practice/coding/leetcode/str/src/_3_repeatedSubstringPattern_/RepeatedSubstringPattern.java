package _3_repeatedSubstringPattern_;

/**
 * @author: cgr
 * @date: 2022/9/9 - 11:03
 */



/* 是否可以重复子串构成   abab  aba    ===>>>  true,false
*   思路：拼接 str = s+s ，判断str在不以 起始下标后的子串是否包含 s
*       进一步变成了 子串的问题  ==> KMP,contain()
*
* */

public class RepeatedSubstringPattern {
    public static void main(String[] args) {

    }

    public boolean repeatedSubstringPattern(String s) {
        String str = s+s;
        return subStr(str,s);
    }

    public boolean subStr(String s1, String s2) {
        int len1 = s1.length(),len2=s2.length();
        if(len1<len2) return false;
        int i = 0, j = 0;
        int[] nexts = getNext(s2);
        while (i<len1&&j<len2){
            if(s1.charAt(i)==s2.charAt(j)){
                i++;
                j++;
            }
            else if(nexts[j]>0){
                j=nexts[j];
            }else{
                i++;
            }
        }
        return j==len2?true:false;
    }

    public int[] getNext(String s){
        int length = s.length();
        int[] next = new int[length];
        next[0]=-1;
        next[1]=0;
        int cn = 0,i=2;
        while (i<length){
            if(s.charAt(i-1)==s.charAt(cn)){
                next[i++] = ++cn;
            }else{
                if(cn<0){
                    cn=0;
                }else{
                    cn = next[cn];
                }
            }
        }
        return next;
    }
}
