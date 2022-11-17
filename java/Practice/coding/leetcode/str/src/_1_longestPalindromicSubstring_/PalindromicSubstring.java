package _1_longestPalindromicSubstring_;

/**
 * @author: cgr
 * @date: 2022/9/2 - 10:33
 */
public class PalindromicSubstring {
    public static void main(String[] args) {
        PalindromicSubstring p = new PalindromicSubstring();
        boolean b1 = p.isPalindromicSubstring("abcasdacba");
        boolean b2 = p.isPalindromicSubstring("abccbsssa");
        System.out.println(b1+"--"+b2);
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
