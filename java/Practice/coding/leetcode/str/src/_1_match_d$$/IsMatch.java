package _1_match_d$$;

/**
 * @author: cgr
 * @date: 2022/10/4 - 19:29
 */


/*  分类讨论，太多细节了
*   思路：动态规划,
*
* */

public class IsMatch {
    public static void main(String[] args) {

    }

    public boolean isMatch(String s, String p) {
//        int sLen = s.length(), pLen = p.length();
//        int index = 0;
//        for (int i = 0;i<pLen;++i){
//            if(p.charAt(i)=='.'){
//                index++;
//            }else if(p.charAt(i)=='*'){
//                if(p.charAt(i-1)=='.') return  true;
//                else {
//                    while (index<sLen){
//                        if(s.charAt(index)!=p.charAt(i)) break;
//                        index++;
//                    }
//                }
//            }else {
//                if(p.charAt(i) != s.charAt(index)) return false;
//                else index++;
//            }
//        }
//        return index == sLen?true:false;
        int m = s.length();
        int n = p.length();

        boolean[][] f = new boolean[m + 1][n + 1];
        f[0][0] = true;
        for (int i = 0; i <= m; ++i) {
            for (int j = 1; j <= n; ++j) {
                if (p.charAt(j - 1) == '*') {
                    f[i][j] = f[i][j - 2];
                    if (matches(s, p, i, j - 1)) {
                        f[i][j] = f[i][j] || f[i - 1][j];
                    }
                } else {
                    if (matches(s, p, i, j)) {
                        f[i][j] = f[i - 1][j - 1];
                    }
                }
            }
        }
        return f[m][n];
    }

    public boolean matches(String s, String p, int i, int j) {
        if (i == 0) {
            return false;
        }
        if (p.charAt(j - 1) == '.') {
            return true;
        }
        return s.charAt(i - 1) == p.charAt(j - 1);
    }

}
