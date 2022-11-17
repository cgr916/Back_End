package _3_reverseWordsInString;

/**
 * @author: cgr
 * @date: 2022/9/6 - 21:52
 */

// medium

/*  每隔 k 个进行翻转
*   思路：分情况讨论
*   1、不足k 直接返回
*   2、
*
* */
public class ReverseStr2 {
    public static void main(String[] args) {

    }

    public String reverseStr(String s, int k) {
        int length = s.length();
        if(length<(2*k)){
            return reverseWords(s, k);
        }
        StringBuffer buffer = new StringBuffer();
        int count = length / (2 * k);
        for(int i = 0;i<=count;++i){
            if(i==count) {
                if(length%(2*k)==0) return buffer.toString();
                buffer.append(reverseWords(s.substring(i*2*k,length),k));
            }
            reverseWords(s.substring(i*2*k,(i+1)*2*k),k);
        }
        return buffer.toString();
    }

    public String reverseWords(String s,int k) {
        StringBuffer stringBuffer = new StringBuffer();
        int len = s.length();
        int flag = len>k?k:len;
        for (int i=flag-1;i>=0;--i){
            stringBuffer.append(s.charAt(i));
        }
        if(len>k){
            for (int i = k;i<len;++i){
                stringBuffer.append(s.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

}
