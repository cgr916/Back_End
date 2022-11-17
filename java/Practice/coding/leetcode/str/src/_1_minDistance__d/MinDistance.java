package _1_minDistance__d;

/**
 * @author: cgr
 * @date: 2022/9/16 - 14:06
 */

// hard

/*  最小编辑距离   horse  ros ==>>>  (rorse\rose\ros):3
*   思路：动态规划
*
* */
public class MinDistance {
    public static void main(String[] args) {

    }

    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();

        // 有一个字符串为空串
        if (n * m == 0) {
            return n + m;
        }

        // DP 数组
        int[][] D = new int[n + 1][m + 1];

        // 边界状态初始化
        //      "  r  o  s
        /*  "   0  1  2  3
        *   h   1  1  2  3
        *   o   2  2  1  2
        *   r   3  2  2  2
        *   s   4  4  3  2
        *   e   5  5  4  3
        *
        * */

        for (int i = 0; i < n + 1; i++) {
            D[i][0] = i;
        }
        for (int j = 0; j < m + 1; j++) {
            D[0][j] = j;
        }

        // 计算所有 DP 值
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int left = D[i - 1][j] + 1;
                int down = D[i][j - 1] + 1;
                int left_down = D[i - 1][j - 1];
                if (word1.charAt(i - 1) != word2.charAt(j - 1)) {
                    left_down ++;
                }
                D[i][j] = Math.min(left, Math.min(down, left_down));
            }
        }
        return D[n][m];
    }
}
