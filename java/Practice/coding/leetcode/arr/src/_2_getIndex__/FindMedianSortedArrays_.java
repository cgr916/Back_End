package _2_getIndex__;

/**
 * @author: cgr
 * @date: 2022/9/19 - 19:10
 */

/*  查找两个正序数组的中位数
*
* 注意点：二分查找 + 左边数字的数目 + 分割线右值大于左值
*
*
* */
public class FindMedianSortedArrays_ {
    public static void main(String[] args) {
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        double[] nums = new double[m + n];
        int i=0,j=0,count=0;
        while (count<(m+n)){
            if(i>=m){
                nums[count++] = nums2[j];
                j++;
            }else if(j>=n){
                nums[count++] = nums1[i];
                i++;
            }else {
                if(nums1[i]<nums2[j]){
                    nums[count++] = nums1[i];
                    i++;
                }else {
                    nums[count++] = nums2[j];
                    j++;
                }
            }
        }
        if((m+n)%2!=0) return nums[(m+n)/2];
        else return (nums[(m+n)/2]+nums[(m+n)/2-1])/2;
    }
}
