package _1_match_d$$;

/**
 * @author: cgr
 * @date: 2022/10/4 - 21:14
 */

/*  通配符匹配： ？ *
*
*
* */
public class IsMatchI {
    public static void main(String[] args) {

    }

    public boolean isMatch(String s, String p) {
        int sLen = s.length(), pLen = p.length();
        boolean[][] dp = new boolean[sLen + 1][pLen + 1];
        dp[0][0] = true;

//        只对第一个 * 进行操作
        for (int j = 1; j <= pLen; ++j) {
            if(p.charAt(j-1) == '*') dp[0][j] = true;
            else dp[0][j] = false;
        }
        for (int i = 1; i <= sLen; ++i) {
            for (int j = 1; j <= pLen; ++j) {
                if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }else if (p.charAt(j-1) == '?' ||
                        p.charAt(j-1) == s.charAt(i-1)){
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        return dp[sLen][pLen];
    }
}
