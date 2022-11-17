package _1_minWindow___s;

import java.util.*;

/**
 * @author: cgr
 * @date: 2022/9/16 - 14:07
 */

/*  最小覆盖子串 s = "ADOBECODEBANC", t = "ABC"  ==>  BANC
*   思路： 用hashmap存相应字符数目，不要用数组 + 滑动窗口
*   关键点：在于不先往 hashmap 中存，而是在比较的时候 边比边存
*   注意点：字符长度：r-l+1   < Integer.MAX_VALUE;
*
* */

public class MinWindow {
    public static void main(String[] args) {
        System.out.println();
    }

    public String minWindow(String s, String t) {
        int len = s.length(),length = t.length(),l=0,r=1;
        if(!isSubSequence(s,t)) return "";
        List<String> list = new ArrayList<>();
        while (l < r && r <= len) {
            if(isSubSequence(s.substring(l,r),t)){
                list.add(s.substring(l,r));
                l++;
            }else r++;
        }
        int size = list.size();
        if(size==0){
            System.out.println("hello");
            return "";
        }
        int minLen = list.get(0).length(),minIndex = 0;
        for (int i =1;i<size;++i){
            if(list.get(i).length()<minLen){
                minLen=list.get(i).length();
                minIndex=i;
            }
        }
        return list.get(minIndex);
    }

    public boolean isSubSequence(String s,String t) {
        HashMap<Character,Integer> sMap = new HashMap();
        HashMap<Character,Integer> tMap = new HashMap();

        Set<Map.Entry<Character, Integer>> entries = tMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            Character key = next.getKey();
            Integer value = next.getValue();
            if(sMap.getOrDefault(key,0)<value) return false;
        }
        return true;
    }
}
