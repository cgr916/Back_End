package _3_useHash;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/28 - 11:36
 */
public class FindCharsInWords {
    public static void main(String[] args) {

    }

    public int find(String[] words,String chars){
//        HashMap<Character, Integer> hs = new HashMap<>();
        int[] cnt = new int[26];
        int count = 0;
        for (char c : chars.toCharArray()) {
            cnt[c-'a'] ++;
        }
        for (String word : words) {
            int len = word.length();
            if(verify(word,cnt)) count+=len;
        }
        return count;
    }

    public boolean verify(String word,int[] cnt){
        int[] vis = new int[26];
        for (char c:word.toCharArray()){
            vis[c-'a']++;
            if(vis[c-'a']>cnt[c-'a']) return false;
        }
        return true;
    }

}
