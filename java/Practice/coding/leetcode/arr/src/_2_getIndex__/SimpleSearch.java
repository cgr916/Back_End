package _2_getIndex__;

/**
 * @author: cgr
 * @date: 2022/9/28 - 19:57
 */
public class SimpleSearch {
    public static void main(String[] args) {

    }

    public int search(int[] nums, int target) {
        int l = 0,r = nums.length - 1;
        while (l<r){
            int mid = (l+r)/2;
            if(target > nums[mid]) l = mid + 1;
            else if(target < nums[mid]) r = mid -1;
            else {
                l = mid;r = mid;
                while (nums[l-1] == target) l--;
                while (nums[r+1] == target) r++;
                return r - l + 1;
            }
        }
        return 0;
    }
}
