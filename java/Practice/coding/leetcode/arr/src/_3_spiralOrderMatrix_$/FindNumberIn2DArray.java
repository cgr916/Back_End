package _3_spiralOrderMatrix_$;

/**
 * @author: cgr
 * @date: 2022/9/18 - 17:16
 */

/*  升序矩阵查找数
*   从右上找起
*
* */
public class FindNumberIn2DArray {
    public static void main(String[] args) {

    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int rows = matrix.length;
        if(rows==0) return false;
        int columns = matrix[0].length;
        if(columns==0) return false;
        int x = 0,y = columns-1;
        while (x<rows && y>=0){
            if(y==0 && x==(rows-1)) {
                if(matrix[x][y] == target) return true;
                else break;
            }
            if(matrix[x][y] == target) return true;
            else if(matrix[x][y] > target) y--;
            else x++;
        }
        return false;
    }


    public void findIndex(int[][] matrix,int[] index,int target){
        int r =index[0],c=index[1];
        while (matrix[r][c] <= target) {
            r++;
            c++;
        }
        index[0]=r;
        index[1]=c;
    }

}
