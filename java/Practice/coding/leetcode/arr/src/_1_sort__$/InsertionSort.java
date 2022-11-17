package _1_sort__$;

/**
 * @author: cgr
 * @date: 2022/9/4 - 16:49
 */

/*  插入排序
*  保证前面的始终为有序，
*
* */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,6,2,5,8,7,4};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertionSort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public void insertionSort(int[] arr){
        int len = arr.length;
        for (int i = 1;i<len;++i){
            for (int j = i;j>=1;--j){
                if(arr[j-1]>arr[j]) swap(arr,j-1,j);
            }
        }
    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
