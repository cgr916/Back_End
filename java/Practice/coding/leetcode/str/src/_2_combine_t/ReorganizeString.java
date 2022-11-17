package _2_combine_t;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: cgr
 * @date: 2022/10/5 - 10:29
 */

/*  重构字符串
*   贪心算法
*   注意点：当 s 为奇数个时，若有（len+1）/ 2 个单词的需要放在偶数索引上
*
* */

public class ReorganizeString {
    public static void main(String[] args) {
        char[] chars = String.valueOf(12345).toCharArray();
        System.out.println(chars.toString());
        HashSet hs = new HashSet();
        HashMap<Object, Object> hashMap = new HashMap<>();
        hs.clear();
        int[] arr = new int[6];
        String s = new String("frege");
    }

    public String reorganizeString(String s) {
        int len = s.length();
        if (len < 2) return s;
        int[] chars = new int[26];
        int cnt = 0,maxCnt = 0;
        for (char c : s.toCharArray()) {
            chars[c-'a']++;
            maxCnt = Math.max(maxCnt,chars[c-'a']);
        }
        int index,idx = 0;
        if(maxCnt > (len+1)/2) return "";
        char[] str = new char[len];
        if(chars[0] == (len+1)/2) index = 0;
        else index = 1;
        while (cnt < len){
            while (chars[idx] > 0){
                if(index == len-1 || index == len-2){
                    if(str[0] == 0) index = 0;
                    else index = 1;
                }
                str[index] = (char)('a'+idx);
                cnt++;
                index += 2;
                chars[idx]--;
            }
            idx++;
        }
        return str.toString();
    }

}
