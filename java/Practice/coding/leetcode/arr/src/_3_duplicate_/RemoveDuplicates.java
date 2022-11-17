package _3_duplicate_;

/**
 * @author: cgr
 * @date: 2022/9/3 - 13:37
 */
public class RemoveDuplicates {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums){
        int i = 0,n=1,len=1;
        while (n<nums.length){
            if(nums[n]==nums[i]) n++;
            else{
                i++;
                nums[i]=nums[n];
                len++;
            }
        }
        return len;
    }

    public int removeDuplicate(int[] nums){
        int l = -1,r = 0;
        while(r < nums.length){
            if(l == -1 || nums[r] != nums[l]){
                l++;
                nums[l] = nums[r];
            }
            r++;
        }
        return l;
    }
}
