package _3_longestContinuousIncreasingSubsequence_;

/**
 * @author: cgr
 * @date: 2022/9/3 - 15:32
 */

/*  最长连续递增子数组
*
*
* */

public class FindLengthOfLCIS {
    public static void main(String[] args) {

    }

    public int findLengthOfLCIS(int[] nums) {
        int count = 1,max=1;
        for (int i = 1;i<nums.length;++i){
            if(nums[i]>nums[i-1]) count++;
            else count = 1;
            max = Math.max(count,max);
        }
        return max;
    }

}
