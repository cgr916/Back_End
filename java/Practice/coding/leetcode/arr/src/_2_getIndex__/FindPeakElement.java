package _2_getIndex__;

/**
 * @author: cgr
 * @date: 2022/9/30 - 14:40
 */
public class FindPeakElement {
    public static void main(String[] args) {

    }

    public int findPeakElement(int[] nums) {
        /*int len = nums.length;
        for(int i = 1;i<len-1;++i){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]) return i;
        }
        return 1001;*/
        int len = nums.length;
        int l = 0, r = len - 1,mid = (l+r)/2;
        while(l<r){
            mid = (l+r)/2;
            if(mid == 0){
                if(nums[0]>nums[1]) return 0;
                else{
                    l = mid + 1;
                    break;
                }
            }
            if(nums[mid+1]<nums[mid] && nums[mid-1]<nums[mid]) return mid;
            else{
                if(nums[mid+1]>nums[mid-1]) l = mid + 1;
                else r = mid;
            }
        }
        if(l==r) return r;
        return mid;
    }
}
