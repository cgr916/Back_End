package _3_reverseWordsInString;

/**
 * @author: cgr
 * @date: 2022/9/6 - 21:14
 */
public class ReverseWords3 {
    public static void main(String[] args) {

    }

    public String reverseWords3(String s) {
        int length = s.length();
        StringBuffer str = new StringBuffer();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0;i<length;++i){
            if(s.charAt(i) != ' ') buffer.append(s.charAt(i));
            else{
                String s1 = reverseWords(buffer.toString());
                str.append(s1);
                buffer.delete(0,buffer.length());
            }
        }
        return str.toString();
    }

    public String reverseWords(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = s.length();
        for (int i=length-1;i>=0;--i){
            stringBuffer.append(s.charAt(i));
        }
        return stringBuffer.toString();
    }
}
