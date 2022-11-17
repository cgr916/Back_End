package _1_longestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;

/**
 * @author: cgr
 * @date: 2022/8/31 - 19:23
 */

// easy
/*
*
*
*
* */

public class NoRepeatingStr {
    public static void main(String[] args) {
        NoRepeatingStr n = new NoRepeatingStr();
        Boolean f1 = n.isNoReptStr("sdfrgr");
        Boolean f2 = n.isNoReptStr("sdfgrz");
        Boolean f3 = n.isNoReptStr("sdsfrgr");
        System.out.println(f1+"--"+f2+"--"+f3);
    }

    public Boolean isNoReptStr(String str){
        HashSet hs = new HashSet();
        for (char c : str.toCharArray()) {
            if(hs.add(c)) continue;
            else  return  false;
        }
        return true;
    }
}
