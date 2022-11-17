package _3_spiralOrderMatrix_$;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: cgr
 * @date: 2022/9/19 - 15:33
 */

/* 合并区间
*
*
* */

public class Merge {
    public static void main(String[] args) {
        System.out.println(new Random().nextInt(2));
    }

    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        int len = intervals.length;
        quickSort(intervals,0,len);
        list.add(intervals[0]);
        for(int i = 1;i<len;++i){
            int begin = list.get(list.size() - 1)[0];
            int end = list.get(list.size() - 1)[1];
            if(intervals[i][0]>end) list.add(intervals[i]);
            else {
                int r = Math.max(intervals[i][1],end);
                list.add(new int[]{begin,r});
            }
        }
        return list.toArray(new int[list.size()][2]);
    }


    public void quickSort(int[][] matrix, int l, int r) {
        if(l>=r) return;
        int partion = partion(matrix, l, r);
        quickSort(matrix,l,partion-1);
        quickSort(matrix,partion+1,r);
    }

    public int partion(int[][] matrix,int l,int r) {
        Random random = new Random();
        int index = random.nextInt(r-l);
        swap(matrix,index,l);
        int begin = l;
        for(int i = l+1;i<r;++i){
            if(matrix[i][0] < matrix[l][0]){
                begin++;
                swap(matrix,begin,i);
            }
        }
        swap(matrix,begin,l);
        return begin;
    }

    public void swap(int[][] matrix,int i,int j){
        int[] temp = new int[2];
        temp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = temp;
    }

}
