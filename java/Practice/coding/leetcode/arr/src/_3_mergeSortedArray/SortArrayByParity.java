package _3_mergeSortedArray;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/18 - 19:24
 */

/*  奇偶排序
*
* */

public class SortArrayByParity {
    public static void main(String[] args) {
        HashMap<Object, Object> hm = new HashMap<>();
    }

    public int[] sortArrayByParity(int[] nums) {
        int len = nums.length;
        int i = 0,j = len;
        while (i<j){
            if(nums[j]%2==0){
                while (nums[i]%2==0) i++;
                swap(nums,i,j);
                j--;
                i++;
            }else j--;
        }
        return nums;
    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

/*  分开维护呀
*
* */
    public int[] sortArrayByParityII(int[] nums) {
        int l = 0,r = 1,len = nums.length;
        while (r < len && l < len) {
            while (nums[r] % 2 == 1) {
                r+=2;
            }
            while (nums[l] % 2 == 0) {
                l+=2;
            }
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        return nums;
    }
}
