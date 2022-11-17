package _2_twoSum__$;

/**
 * @author: cgr
 * @date: 2022/9/19 - 16:22
 */


public class TwoMul {
    public static void main(String[] args) {
        System.out.println();
    }

    public int maxProduct(int[] nums) {
        int pre = 1, max = 0;
        int len = nums.length;
        for(int i = 0;i<len;++i){

            pre = Math.max(pre,pre*nums[i]);
            max = Math.max(max,pre*nums[i]);
        }
        return max;
    }
}
