package _2_Paths;

/**
 * @author: cgr
 * @date: 2022/9/3 - 19:17
 */
public class UniquePaths {
    public static void main(String[] args) {

    }

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        arr[0][0]=1;
        for (int i = 1;i<m;++i){
            arr[i][0]=1;
        }
        for (int j = 1;j<n;++j){
            arr[0][j]=1;
        }
        for(int i=1;i<m;++i){
            for (int j=1;j<n;++j){
                arr[i][j] = arr[i-1][j]+arr[i][j-1];
            }
        }
        return arr[m-1][n-1];
    }

}
