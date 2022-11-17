package _1_sort__$;

/**
 * @author: cgr
 * @date: 2022/9/4 - 16:48
 */

/*  冒泡排序
*  两两对比，小的前移，多次循环
*
* */
public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[]{1,3,6,2,5,8,7};
        bubbleSort.bubbleSort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public void bubbleSort(int[] arr){
        int len = arr.length;
        int count = 0,flag=0;
        for(int j = 0;j<len-1;++j){
            count = 0;
            flag++;
            for (int i = 1;i<len;++i){
                if(arr[i-1]>arr[i]) {
                    swap(arr,i-1,i);
                    count++;
                }
            }
            if(count==0) break;
        }
        System.out.println(flag);
        // 优化：如何嵌套的for循环内 arr 未发生改变，则直接break
    }

    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
