package _1_longestPalindromicSubstring_;

/**
 * @author: cgr
 * @date: 2022/9/2 - 10:33
 */

// medium

/*  最长回文子串   "ababaca" => "ababa"
*   思路：Manacher算法 =>  回文半径、回文半径数组、最右边界、回文圆心
*   1、创建子函数实现回文半径获取（前后插入‘#’时）；
*   2、边遍历边获取（通过添加不同的前后符号，如$\!等）
*
*
*   注意点：回文半径是否包含回文圆心 --->>> 需要注意前后一致的问题
*
* */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring l = new LongestPalindromicSubstring();
        String s1 = l.getLongestPalindromicSubstring("1swsaa1bab1syz1");
        System.out.println(s1);
    }

    public String getLongestPalindromicSubstring(String str) {
        //暴力循环检索
        //.......

        //Manacher算法
        // 回文半径、最右边界、回文半径数组
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        while(i<str.length()){
            stringBuffer.append("#");
            stringBuffer.append(str.charAt(i));
            i++;
        }
        stringBuffer.append("#");
        System.out.println(stringBuffer.toString());
        int left=0,right = 0;
        int R=0,C=0;
        int[] radius = new int[stringBuffer.length()];
        radius[0]=0;
        for (i=1;i<stringBuffer.length();i++){
            if(i<=R){
                int min_r = Math.min(R-i,radius[2*C-i]);
                radius[i] = getRadius(stringBuffer,i-min_r,i+min_r);
            }
            else {
                radius[i] = getRadius(stringBuffer, i - 1, i + 1);
            }
            if(i+radius[i] > R){
                R = i + radius[i];
                C = i;
            }
            if(right-left < 2*radius[i]){
                left = C - radius[i];
                right = R;
            }
        }
        System.out.println(left+"--"+right);
        StringBuffer buf = new StringBuffer();

        for(int j = left;j<=right;++j){
            if(stringBuffer.charAt(j)!='#') buf.append(stringBuffer.charAt(j));
        }
        return buf.toString();
    }

    public int getRadius(StringBuffer sb, int left,int right) {
        while(left >= 0 && right <sb.length() && sb.charAt(left)==sb.charAt(right)){
            left--;
            right++;
        }
        return (right-left-2)/2;
    }
}
