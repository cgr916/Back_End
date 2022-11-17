package _2_nextPermutation__;

/**
 * @author: cgr
 * @date: 2022/9/3 - 17:07
 */
public class NextPermutation {
    public static void main(String[] args) {

    }

    public void nextPermutation(int[] nums) {
        //字典排序
        //List<List<Integer>> lists = new ArrayList<List<Integer>>();
        int len = nums.length;
        int n1=0,n2=0;
        for (int i = len-2;i>=0;--i){
            if(nums[i+1]>=nums[i]){
                n1 = i;
                break;
            }
        }
        for (int i = len-1;i>=0;--i){
            if(nums[i]>=n1){
                n2 = i;
                break;
            }
        }
        swap(nums,n1,n2);
        reverse(nums,n1+1,len-1);

    }

    public void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums, int i, int j) {
        if(i==j) return;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

}
