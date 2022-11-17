package _2_twoSum__$;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/18 - 19:54
 */

/*  三数之和
*   注意点：第一个数的第一个可以取一样的，但是第二个不能；
*           第二个数不能取相同的
*
* */
public class ThreeSum {
    public static void main(String[] args) {
        System.out.println();
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        ArrayList<List<Integer>> list = new ArrayList<>();
        int first = 0,second = 1,third = len-1;
        while (first<len-3) {
            while (second < third) {
                if (nums[first] + nums[second] + nums[third] == 0) {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(first);
                    temp.add(second);
                    temp.add(third);
                    list.add(temp);
                } else if (nums[first] + nums[second] + nums[third] > 0) third--;
                else second++;
            }
            first++;
            second = first+1;
            third = len -1;
        }
        return list;
    }

}
