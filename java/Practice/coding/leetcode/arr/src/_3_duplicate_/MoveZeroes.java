package _3_duplicate_;

/**
 * @author: cgr
 * @date: 2022/9/18 - 12:49
 */

/*  移动0  [0,1,2,3,0,2,3,1]
*   双指针  滚动式向前
*
* */

public class MoveZeroes {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        int len  = nums.length;
        for (int i = len - 1; i >= 0; --i) {
            if(nums[i]==0) {
                helper(nums,i);
            }
        }
    }

    public void helper(int[] nums,int index){
        int len = nums.length;
        for (int i = index;i<len-1;++i){
            if(nums[i+1]!=0) {
                swap(nums,i,i+1);
            }else break;
        }
    }

    public void swap(int[] nums,int i,int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
