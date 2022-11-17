package _1_parenthesis_$;

/**
 * @author: cgr
 * @date: 2022/9/2 - 15:48
 */


/*
*
*
* */
public class ValidParentheses {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {
        int i = 0;
        StringBuffer buf = new StringBuffer();
        while (i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{'){
                buf.append(s.charAt(i));
            }else{
                if(buf.length() > 0){
                    switch (s.charAt(i)){
                        case ')':
                            if(buf.charAt(buf.length()-1) == '('){
                                buf.deleteCharAt(buf.length()-1);
                            }else return false;
                            break;
                        case ']':
                            if(buf.charAt(buf.length()-1) == '['){
                                buf.deleteCharAt(buf.length()-1);
                            }else return false;
                            break;
                        case '}':
                            if(buf.charAt(buf.length()-1) == '{'){
                                buf.deleteCharAt(buf.length()-1);
                            }else return false;
                            break;
                    }
                }
                else return false;
            }
            i++;
        }
        return buf.length() == 0? true:false;
    }
}
