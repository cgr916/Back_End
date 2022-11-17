package _2_twoSum__$;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/3 - 15:39
 */

/* 数组中的子数组和为 k   [3,4,7,2,-3,1,4,2]
*
*   pre   k
*
* */
public class SubarraySum {
    public static void main(String[] args) {

    }

    public int subarraySum(int[] nums, int k) {
        Arrays.sort(nums);
        //暴力循环
        //双指针-->条件不足
        int pre=0,len=nums.length,count = 0;
        /*while (i<=j){
            if(nums[j]>k) j--;
            else if(nums[j]==k){
                count++;
                j--;
            }else{
                if(sumArr(nums,i,j)>k){
                    i++;
                }else if(sumArr(nums,i,j) == k){
                    count++;
                    break;
                }else break;
            }
        }
        */
        //前缀和与哈希表优化：
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int i=0;i<len;++i){
            pre+=nums[i];
            if(!hm.containsKey(pre)) hm.put(pre,1);
            else hm.put(pre,hm.get(pre)+1);
            if(hm.containsKey(pre-k)) count++;
        }
        return count;
    }

    public int sumArr(int[] arr,int l,int r) {
        int temp = 0;
        for (int i=l;i<=r;++i){
            temp+=arr[i];
        }
        return temp;
    }

}
