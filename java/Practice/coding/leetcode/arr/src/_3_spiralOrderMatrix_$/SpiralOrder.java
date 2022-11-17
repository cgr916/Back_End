package _3_spiralOrderMatrix_$;

import java.util.ArrayList;

/**
 * @author: cgr
 * @date: 2022/9/18 - 15:10
 */

/* 顺时针读矩阵
*
*
* */
public class SpiralOrder {
    public static void main(String[] args) {
        int c = 0;
        for (int i =10;i>0;--i){
            c++;
        }
        System.out.println(c);

        ArrayList<Integer> integers = new ArrayList<>();
        int[][] arr = new int[1][3];
    }

    public int[] spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        if (rows==0||columns==0) return null;
        int[] nums = new int[rows * columns];
        int count = 0;
        int i = rows,j=columns;
        int m=0,n=0;
        int r = 0,c=0;
        while (count<rows*columns){
            while (c<j){
                nums[r*rows+c] = matrix[r][c];
                count+=1;
                c+=1;
            }
            r+=1;
            m+=1;
            while (r<i){
                nums[r*rows+c] = matrix[r][c];
                r+=1;
                count+=1;
            }
            c-=1;
            j--;
            while (c>=n){
                nums[r*rows+c] = matrix[r][c];
                c-=1;
                count+=1;
            }
            r-=1;
            i--;
            while (r>=m){
                nums[r * rows + c] = matrix[r][c];
                r-=1;
                count++;
            }
            r+=1;
            n+=1;
        }
        return nums;
    }



}
