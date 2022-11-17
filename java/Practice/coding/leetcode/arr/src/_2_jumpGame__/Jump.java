package _2_jumpGame__;

/**
 * @author: cgr
 * @date: 2022/9/3 - 20:31
 */
public class Jump {
    public static void main(String[] args) {
        System.out.println();
    }
    public int count;

    public int jump(int[] nums) {
        int len = nums.length;
        int end = 0, max = 0, steps = 0;
        for (int i = 0; i < len; ++i) {
            max = Math.max(max,i+nums[i]);
            if (i == end){
                end = max;
                steps++;
            }
            if (max == len) {
                steps++;
                break;
            }
        }
        return steps;
    }


}
