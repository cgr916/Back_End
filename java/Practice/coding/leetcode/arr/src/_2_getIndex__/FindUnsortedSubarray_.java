package _2_getIndex__;

/**
 * @author: cgr
 * @date: 2022/9/28 - 21:11
 */


/*  找出最短无序子数组     [2,6,4,8,10,9,15]
*   维护最小、最大值
*
* */
public class FindUnsortedSubarray_ {
    public static void main(String[] args) {

    }

    public int findUnsortedSubarray(int[] nums) {
        int len = nums.length;
        int l = 0,r = 0;
        int max = nums[0],min = nums[len-1];
        for(int i = 1;i<len;++i){
            if(nums[i] < max) r = i;
            else max = nums[i];
            if(nums[len-1-i] > min) l = len-1-i;
            else min = nums[len-1-i];
        }
        return r-l+1;
    }
}
