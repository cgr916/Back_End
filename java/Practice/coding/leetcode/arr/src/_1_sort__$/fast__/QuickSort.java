package _1_sort__$.fast__;

import java.util.Random;

/**
 * @author: cgr
 * @date: 2022/9/4 - 16:50
 */

/*  快速排序
*  随机选中节点，节点前必小于该节点的数，节点后必大于该节点的数
*
* */
public class QuickSort {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{1,3,6,2,5,8,7,4,9,9,10};
        quickSort.quickSort(arr,0,arr.length);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public void quickSort(int[] arr, int l, int r) {
        if(l>=r) return;
        // 此处
        int index = partition(arr, l, r);
        quickSort(arr,l,index);
        quickSort(arr,index+1,r);
    }


    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int partition(int[] arr,int l,int r){
        Random random = new Random();
        int rdm = random.nextInt(r - l);
        // 出错的地方
        swap(arr,rdm+l,l);
        int mid = l;
        for (int i = l+1;i<r;++i){
            if(arr[i]<=arr[l]) {
                mid++;
                swap(arr,i,mid);
            }
        }
        swap(arr,mid,l);
        return mid;
    }
}
