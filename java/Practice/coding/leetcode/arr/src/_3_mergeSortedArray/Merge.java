package _3_mergeSortedArray;

import java.util.Arrays;

/**
 * @author: cgr
 * @date: 2022/9/3 - 13:47
 */

/*  合并两个有序数组
*
* */
public class Merge {
    public static void main(String[] args) {

    }

    public void merge(int[] nums1, int m, int[] nums2, int n){
        for (int i=m;i<nums1.length;++i){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
    }
}
