package _3_thousandSeparator;

/**
 * @author: cgr
 * @date: 2022/9/8 - 21:14
 */

/*  千分位分隔符  123456789 ===>>> 123.456.789
*
* */
public class ThousandSeparator {
    public static void main(String[] args) {

    }

    public String thousandSeparator(int n) {
        String str = String.valueOf(n);
        if(n<1000) return str;
        int len = str.length();
        StringBuffer sb = new StringBuffer(len);
        for(int i = len-1;i>=0;--i){
            sb.append(str.charAt(i));
        }
        return reverseStr(sb);
    }

    public String reverseStr(StringBuffer sb){
        int len = sb.length();
        StringBuffer str = new StringBuffer();
        for (int i = len-1;i>=0;--i){
            str.append(sb.charAt(i));
        }
        return str.toString();
    }
}
