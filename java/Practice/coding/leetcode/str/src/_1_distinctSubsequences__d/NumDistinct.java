package _1_distinctSubsequences__d;

/**
 * @author: cgr
 * @date: 2022/9/2 - 15:13
 */

// hard

/*  不同子序列： bag  babbagg  ==>>
 *   思路：利用前缀，前缀为ba 在后一个字符匹配的情况下是能够与其进行组合的 +bag 对应的个数
*       ''  b   a   g
*   ''  1   0   0   0
*   b   1   1   0   0
*   a   1   1   1   0
*   b   1   2   1   0
*   b   1   3   1   0
*   a   1   3   4   0
*   g   1   3   4   4
*   g   1   3   4   8
*
* */

public class NumDistinct {
    public static void main(String[] args) {

    }

    //动态规划
    public int numDistinct(String s, String t) {
        int m = s.length(),n=t.length();
        if(m<n) return 0;
        int[][] dp = new int[m+1][n+1];
        // 反向比对
//        for(int i = 0;i<=m;++i){
//            dp[i][n]=1;
//        }
//        for(int i = m-1;i>=0;--i){
//            for(int j = n-1;j>=0;--j){
//                if(s.charAt(i)==t.charAt(j)) dp[i][j] = dp[i+1][j+1]+dp[i+1][j];
//                else dp[i][j] = dp[i+1][j];
//            }
//        }
//        return dp[0][0];
        //正向比对
        for(int i = 0;i<=m;++i){
            dp[i][0]=1;
        }
        for(int i=1;i<=m;++i){
            for(int j =1;j<=n;++j){
                if(s.charAt(i)==s.charAt(j)) dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
                else  dp[i][j] = dp[i-1][j];
            }
        }
        return dp[m][n];
    }
}
