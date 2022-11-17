package _3_spiralOrderMatrix_$;

/**
 * @author: cgr
 * @date: 2022/10/2 - 19:58
 */

/*  翻转矩阵：上下翻转 + 主对角线翻转
*
*
* */
public class Rotate {
    public static void main(String[] args) {

    }

    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[] nums = new int[len];
        // 水平翻转
        int i = 0,j = len-1;
        while (i<j){
            nums = matrix[i];
            matrix[i] = matrix[j];
            matrix[j] = nums;
            i++;
            j--;
        }
        for(int m = 0;m<len;++m){
            for(int n = m+1;n<len;++n){
                int temp = matrix[m][n];
                matrix[m][n] = matrix[n][m];
                matrix[n][m] = temp;
            }
        }
    }

}
