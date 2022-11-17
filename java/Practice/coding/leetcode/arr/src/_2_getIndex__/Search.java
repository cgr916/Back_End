package _2_getIndex__;

/**
 * @author: cgr
 * @date: 2022/9/18 - 23:21
 */

/*  搜索旋转后数组中指定值的索引
*
*
* */
public class Search {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int k = 0;
        int len = nums.length;
        if(nums[0]<nums[len-1]) k = 0;
        else {
            for(int i = len-1;i>0;--i){
                if(nums[i] < nums[i-1]){
                    k = i;
                    break;
                }
            }
        }
        int index = -2;
        int l1 = 0,r1=k-1;
        int l2 = k,r2= len-1;
        while (l1<=r1 && r1<=k-1 && l1>=0){
            int mid = (l1+r1)/2;
            if(nums[mid]>target){
                r1 = mid-1;
            }
            else if(nums[(l1+r1)/2]<target){
                l1 = mid+1;
            }else return mid;
        }
        while (l2<=r2 && r2<=len-1 && l2>=k){
            int mid = (l2+r2)/2;
            if(nums[mid]>target){
                r1 = mid-1;
            }
            else if(nums[(l1+r1)/2]<target){
                l1 = mid+1;
            }else return mid;
        }
        return index==-2?-1:index;
    }

    public void helper(int i,int j){
        int mid = 0;
    }

}
