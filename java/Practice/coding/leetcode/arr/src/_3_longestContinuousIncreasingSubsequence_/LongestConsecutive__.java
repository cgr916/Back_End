package _3_longestContinuousIncreasingSubsequence_;

import java.util.HashSet;

/**
 * @author: cgr
 * @date: 2022/10/2 - 22:10
 */
public class LongestConsecutive__ {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(4);
        hs.add(200);
        hs.add(1);
        hs.add(3);
        hs.add(2);
        for (Integer h : hs) {
            System.out.println(h);
        }

    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int maxLen = 0;
        for (int num:nums){
            hs.add(num);
        }
        int begin = 0;

        for (Integer num : hs){
            if (!hs.contains(num - 1)) {
                int currentNum = num;
                int cnt = 1;

                while (hs.contains(currentNum + 1)) {
                    currentNum ++;
                    cnt ++;
                }

                maxLen = Math.max(maxLen, cnt);
            }
        }
        return maxLen;
    }
}
