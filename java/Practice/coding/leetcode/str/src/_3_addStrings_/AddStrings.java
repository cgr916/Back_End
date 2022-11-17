package _3_addStrings_;

/**
 * @author: cgr
 * @date: 2022/9/14 - 16:21
 */

// easy+

/*  字符串相加  123 234  ==>>>  357
*   思路：进位、余数  以及收尾时判断进位是否为0 进行补位
*
* */

public class AddStrings {
    public static void main(String[] args) {

    }

    public String addStrings(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int i = len1 - 1, j = len2 - 1;
        int c = 0, rest = 0;
        StringBuffer buffer = new StringBuffer();
        while (i>=0 || j>=0){
            if(j<0){
                rest = c + (num1.charAt(i)) % 10;
                c = c + (num1.charAt(i)) / 10;
                buffer.append(rest);
            }else if(i<0){
                rest = c + (num2.charAt(j)) % 10;
                c = c + (num2.charAt(j)) / 10;
                buffer.append(rest);
            }else {
                rest = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + c % 10;
                c = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + c / 10;
                buffer.append(rest);
            }
            i--;
            j--;
        }
        if(c>0) buffer.append(c);
        return buffer.toString();
    }

    public void reverseStr(StringBuffer buf){
        int l = 0,r =buf.length()-1;
        while (l<r){
            char cl = buf.charAt(l);
            char cr = buf.charAt(r);
            buf.setCharAt(r,cl);
            buf.setCharAt(l,cr);
            l++;
            r--;
        }
    }
}
