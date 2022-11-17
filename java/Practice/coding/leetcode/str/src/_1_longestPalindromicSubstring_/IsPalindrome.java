package _1_longestPalindromicSubstring_;

/**
 * @author: cgr
 * @date: 2022/9/6 - 21:37
 */

// easy

/*  判断是否为回文串  "aba" ""ab" => true,false
*
*
* */
public class IsPalindrome {
    public static void main(String[] args) {
        String s = new String();
    }

    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int length = s.length();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0;i<length;++i){
            if(s1.charAt(i)>='a'&&s1.charAt(i)<='z') buffer.append(s1.charAt(i));
        }

        return isPalindromicSubstring(buffer.toString());
    }

    public boolean isPalindromicSubstring(String str) {
        int l=0,r= str.length()-1;
        while(l<r){
            if(str.charAt(l)==str.charAt(r)){
                l++;
                r--;
            }else {
                return false;
            }
        }
        return true;
    }

}
