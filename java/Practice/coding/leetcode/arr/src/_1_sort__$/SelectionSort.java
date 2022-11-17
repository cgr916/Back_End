package _1_sort__$;

/**
 * @author: cgr
 * @date: 2022/9/4 - 16:49
 */

/*  选择排序
*   选择最小的，排前面；再以此类推
*
* */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,6,2,5,8,7,4};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr);
        for (int i : arr) {
            System.out.print(i);
        }
    }

    public void selectionSort(int[] arr){
        int index = 0;
        int len = arr.length;
        for (int i = 0;i<len-1;++i){
            index = i;
            for (int j =i+1;j<len;++j){
                if(arr[index]>arr[j]) index = j;
            }
            swap(arr,i,index);
        }
    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
