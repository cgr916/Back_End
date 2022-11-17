package _3_reverseWordsInString;

import java.util.ArrayList;

/**
 * @author: cgr
 * @date: 2022/9/2 - 13:09
 */
public class ReverseWords {
    public static void main(String[] args) {
//        String s = "the sky is blue";
        String s = "  hello world  ";
        ReverseWords r = new ReverseWords();
        String s1 = r.reverse(s);
//        System.out.println(s.charAt(1) == ' ');
        System.out.println(s1);
    }

    public String reverse(String str) {
        ArrayList<StringBuffer> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            if (str.charAt(i) != ' ') {
                StringBuffer buf = new StringBuffer();
                while(str.charAt(i)!=' '){
                    buf.append(str.charAt(i));
                    i++;
                    if(i>=str.length()) break;
                }
                list.add(buf);
            }else i++;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for(int j = list.size()-1;j>=0;--j){
            stringBuffer.append(list.get(j));
            if(j!=0) stringBuffer.append("-");
        }
        return stringBuffer.toString();
    }
}
