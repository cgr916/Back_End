package _2_maximumSubarray__;

/**
 * @author: cgr
 * @date: 2022/10/5 - 22:12
 */
public class MinSubArrayLen {
    public static void main(String[] args) {

    }

    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        // int[] pre = new int[len+1];
        // pre[0] = 0;
        // int sum = 0;
        // int ansL = -1,ansR = len;
        // for(int i = 0;i<len;++i){
        //     sum += nums[i];
        //     int l = 0;
        //     int r = i;
        //     while(l<=r && r<=i){
        //         int mid = (l+r+1)/2;
        //         if(sum - target >= pre[mid]){
        //             if(ansR - ansL > i+1 - mid){
        //                 ansL = mid;
        //                 ansR = i+1;
        //             }
        //             l = mid+1;
        //         }else r = mid -1;
        //     }
        //     pre[i+1] = sum;
        // }
        // if(ansL == -1) return 0;
        // return ansR - ansL;
        int l = 0,r = 0;
        int minLen = len+1,sum=nums[0];
        while(l<=r && r<len){
            if(sum >= target){
                minLen = Math.min(minLen,r-l+1);
                sum -= nums[l];
                l++;
            }else{
                ++r;
                if(r>=len) break;
                sum += nums[r];
            }
        }
        if(minLen == len+1) return 0;
        return minLen;
    }
}
