package _2_twoSum__$;

import java.util.Arrays;

/**
 * @author: cgr
 * @date: 2022/9/18 - 20:59
 */

/*  有效三角形
*   还是双循环
*
* */
public class TriangleNumber {
    public static void main(String[] args) {
        int[] nums = new int[10];
        for (int num : nums) {
            System.out.println(num);
        }

        System.out.println();
    }

    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int f = 0, s = 1, t = len-1;
        int count = 0;
        while (f<=len-3){
            while (s<t && nums[f]+nums[s]>nums[t]){
                count++;
                t--;
            }
            t++;
            while (s<t && nums[f]+nums[s]>nums[t]){
                count++;
                s++;
            }
            f++;
            s=f+1;
        }
        return count;
    }


}
