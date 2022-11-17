package _2_Paths;

import java.util.List;

/**
 * @author: cgr
 * @date: 2022/10/2 - 20:22
 */

/*  从矩阵左上角到右下角经过数字的最小和
 *
 * */

public class MinPathSum {
    public  int m,n;
    public List<Integer> list;
    public static void main(String[] args) {

    }

    public int minPathSum(int[][] grid) {
//        int size = list.size();
//        int minPathSum = list.get(0);
//        for (Integer num : list) {
//            minPathSum = Math.min(minPathSum,num);
//        }
//        return minPathSum;
        int m = grid.length;
        int n = grid[0].length;
        int temp = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if(i-1<0 && j-1<0) continue;
                else if(i-1>=0 && j-1<0) temp = grid[i-1][j];
                else if(i-1<0 && j-1>=0) temp = grid[i][j-1];
                else temp = Math.min(grid[i-1][j],grid[i][j-1]);
                grid[i][j] += temp;
            }
        }
        return grid[m-1][n-1];
    }

    public void helper(int[][] grid, int l, int r, int sum) {
        if(l>m || r>n) return;
        if (l == m && r == n) {
            list.add(sum);
            return;
        }
        sum += grid[l][r];
        helper(grid,l+1,r,sum);
        helper(grid,l,r+1,sum);
    }
}
