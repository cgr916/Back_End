package _3_useHash;

import java.util.Arrays;

/**
 * @author: cgr
 * @date: 2022/9/28 - 16:18
 */

/*
*
*
* */
public class MaximumProduct {
    public static void main(String[] args) {

    }

    public int maximumProduct(int[] nums){
        int len = nums.length;
        Arrays.sort(nums);
        int res = nums[len-1]*nums[len-2]*nums[len-3];
        if (len > 3 && nums[len - 1] > 0 && nums[0] < 0) {
            int temp = nums[0]*nums[1]*nums[len-1];
            if (res > temp) return res;
            else return temp;
        } else {
            return res;
        }
    }
}
