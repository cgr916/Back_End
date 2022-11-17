package _2_maximumSubarray__;

/**
 * @author: cgr
 * @date: 2022/9/3 - 11:42
 */


public class MaxSubArray {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        //滑动窗口的条件无法确定
        /*int max = 0;
        boolean flag =true;
        int l = 0, r = nums.length;
        for (int i = 0; i < r; ++i) {
            max+=nums[i];
        }
        while(l<=r){
            if(max-nums[l]>max-nums[r]){
                max = Math.max(max-nums[l],max);
                l++;
            }else{
                max = Math.max(max-nums[r],max);
                r++;
            }
        }
        System.out.println();
        return max;*/

        //
        int pre = 0,max = nums[0];
        for (int i:nums){
            pre = Math.max(pre+i,i);
            max = Math.max(max,pre);
        }
        return max;
    }
}
