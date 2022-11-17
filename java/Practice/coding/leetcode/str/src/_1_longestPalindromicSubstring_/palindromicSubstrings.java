package _1_longestPalindromicSubstring_;

/**
 * @author: cgr
 * @date: 2022/9/15 - 10:58
 */

// medium

/* 回文子串个数  aba => a b a aba => 4
*   思路：借助 Manacher 算法，利用回文半径的一半相加即可得;
*
*   注意点：包括 “#” 中的回文半径的一半
*
*
* */
public class palindromicSubstrings {
    public static void main(String[] args) {
        String s = "dfreferferf";
        StringBuilder builder = new StringBuilder(s);
        System.out.println();
    }

    public int countSubstrings(String s) {
        int len = s.length();
        StringBuffer buffer = new StringBuffer("B#");
        for(int i=0;i<len;++i){
            buffer.append(s.charAt(i));
            buffer.append('#');
        }
        len = buffer.length();
        int[] r = new int[len];
        int rMax=0,jMax=0,res=0;
        buffer.append('E');
        for (int j =1;j<len;++j){
            r[j] = j<rMax?(Math.min(rMax-j+1,r[2*jMax-j])):1;
            while (buffer.charAt(j+r[j])==buffer.charAt(j-r[j])){
                r[j]++;
            }
            if(j+r[j]>rMax){
                rMax = j+r[j];
                jMax = j;
            }
            res += r[j]/2;
        }
        return res;
    }


}
