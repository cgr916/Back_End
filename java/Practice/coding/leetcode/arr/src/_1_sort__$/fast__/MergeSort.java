package _1_sort__$.fast__;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author: cgr
 * @date: 2022/9/4 - 16:51
 */

/*  归并排序
 *  分治 + 递归
 *
 * */
public class MergeSort {
    public static int[] temp;
    public static void main(String[] args) {
        temp = new int[]{1, 2, 3, 4, 5};
        int asInt = Arrays.stream(temp).max().getAsInt();
        int sum = Arrays.stream(temp).sum();
        System.out.println(asInt);
        System.out.println(sum);
    }

    public void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        for (int i =l;i<=r;++i){
            temp[i] = arr[i];
        }
        int i = l;
        int j = mid+1;
        // 排序
        for(int k = l;k<=r;++k){
            if(temp[i]<temp[j]){
                arr[k]=temp[i];
                i++;
            }
        }


    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
