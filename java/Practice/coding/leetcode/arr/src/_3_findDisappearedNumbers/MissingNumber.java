package _3_findDisappearedNumbers;

/**
 * @author: cgr
 * @date: 2022/9/18 - 16:26
 */
public class MissingNumber {
    public static void main(String[] args) {
        System.out.println();
    }

    public int missingNumber(int[] nums) {
        int len = nums.length;
        int c = 0;
        int[] records = new int[len + 1];
        for (int i = 0; i < len; ++i) {
            if (records[nums[i]] == 0) records[nums[i]] = 1;
        }
        for (int i = 0; i < len; ++i) {
            if (records[i] == 0)  c=i;
        }
        return c;
    }
}
