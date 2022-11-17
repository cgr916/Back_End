package _2_twoSum__$;

/**
 * @author: cgr
 * @date: 2022/9/18 - 17:02
 */
public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] nums = new int[2];
        int l=0,r=len-1;
        while (l<r){
            if(numbers[l]+numbers[r]>target){
                r--;
            }else if(numbers[l]+numbers[r]<target){
                l++;
            }else {
                nums[0]=l+1;
                nums[1]=r+1;
                break;
            }
        }

        return nums;
    }
}
