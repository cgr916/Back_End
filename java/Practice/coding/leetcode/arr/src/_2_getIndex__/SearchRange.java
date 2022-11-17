package _2_getIndex__;

/**
 * @author: cgr
 * @date: 2022/9/19 - 18:20
 */

/*  在排序数组中找到元素第一个及最后一个的索引
*
* */
public class SearchRange {
    public static void main(String[] args) {

    }

    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        int[] res = new int[]{-1,-1};
        int i = 0;
        while (i<len){
            if(nums[i]<target) i++;
            else if(nums[i]==target){
                if(res[0]<0){
                    res[0] = i;
                    res[1] = i;
                }else res[1]++;
                i++;
            }else break;
        }
        return res;
    }

}
