package _2_getIndex__;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/28 - 22:10
 */

/*  找到与原数组具有相同度的 子数组
*   (度:数组中某数字出现频次的最大值)
*
*
* */
public class Degree {
    public static void main(String[] args) {

    }

    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        HashMap<Integer, Integer> idx = new HashMap<>();
        int len = nums.length,maxDegree = 0,minLen = -1;
        for (int i = 0;i < len;++i){
            if(hs.getOrDefault(nums[i],0)+1 > maxDegree){
                minLen = i - idx.get(nums[i]);
                hs.put(nums[i], hs.getOrDefault(nums[i],0)+1);
            }else if(hs.getOrDefault(nums[i],0)+1 == maxDegree){
                if(minLen < 0){
                    minLen = i - idx.get(nums[i]);
                }else {
                    minLen = Math.min(minLen,i-idx.get(nums[i]));
                }
            }
            if(!idx.containsKey(nums[i])) idx.put(nums[i],i);
        }
        return minLen;
    }
}
