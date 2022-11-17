package _1_longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

/**
 * @author: cgr
 * @date: 2022/8/31 - 19:23
 */


/*  最长无重复子串  abcabcbb ==> abc  3
*   思路：先实现能够判断字符串是否含重复字符;
*       然后使用通过 滑动窗口 实现较小的时间复杂度
*   1：通过 hashset
* */

public class LongestNoRepeatingStr {
    public static void main(String[] args) {
        LongestNoRepeatingStr l = new LongestNoRepeatingStr();
//        String res1 = l.getStr("bbbbbbb");
        String res2 = l.getStr("aabaab!bb");
//        System.out.println(res1);
        System.out.println("--"+res2);
    }

    public String getStr(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;
        int j=1;
        StringBuffer buf = new StringBuffer();
        StringBuffer s = new StringBuffer();
        buf.append(chars[0]);
        while(j<=length) {
            if (isNoReptStr(buf.toString())) {
                if(j==length) break;
                buf.append(chars[j]);
                j++;
                System.out.println(buf.toString());
            } else {
                if (s.length() < buf.length() - 1) {
                    s.delete(0,s.length());
                    s.append(buf.toString());
                    s.deleteCharAt(s.length() - 1);
                }
                buf.deleteCharAt(0);
            }
        }
        return s.toString();
    }

    public boolean isNoReptStr(String str){
        HashSet hs = new HashSet();
        for (char c : str.toCharArray()) {
            if(hs.add(c)) continue;
            else  return  false;
        }
        return true;
    }


}
