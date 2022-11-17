package _3_duplicate_;

/**
 * @author: cgr
 * @date: 2022/9/28 - 21:04
 */
public class FindRepeatNumber {
    public static void main(String[] args) {

    }

    public int findRepeatNumber(int[] nums) {
        int len = nums.length;
        int temp = nums[0];
        for (int i = 1; i < len; ++i) {
            if(nums[i] == temp) return temp;
            temp = nums[i];
        }
        return -1;
    }
}
