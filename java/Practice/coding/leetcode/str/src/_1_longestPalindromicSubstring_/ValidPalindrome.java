package _1_longestPalindromicSubstring_;

/**
 * @author: cgr
 * @date: 2022/10/4 - 23:17
 */
public class ValidPalindrome {
    public static void main(String[] args) {

    }

    public boolean validPalindrome(String s) {
        int l = 0,r = s.length() - 1;
        while (l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else {
                if(s.charAt(l) == s.charAt(r-1)) r--;
                else if(s.charAt(r) == s.charAt(l+1)) l++;
                else return false;
            }
        }
        return true;
    }

}
