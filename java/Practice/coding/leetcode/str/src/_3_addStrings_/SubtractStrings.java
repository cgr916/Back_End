package _3_addStrings_;

/**
 * @author: cgr
 * @date: 2022/9/14 - 16:41
 */

/*  字符串相减   123 23 ==>>>  100
*   思路：借位、余数，这里需要考虑两个数的大小关系
*
* */
public class SubtractStrings {
    public static void main(String[] args) {
        SubtractStrings subtractStrings = new SubtractStrings();
        String s = subtractStrings.subtractStrings("2345665", "12345678");
//        System.out.println(s);
        System.out.println(Integer.toUnsignedString(Integer.MIN_VALUE,10));
        System.out.println(Integer.toUnsignedString(Integer.MIN_VALUE,16));
    }

    public String subtractStrings(String num1, String num2){
        if(num1.equals(num2)) return "0";
        StringBuffer s = new StringBuffer();
        if(compare(num1,num2)){
            s = subtract(num1, num2);
        }else{
            s = subtract(num2, num1);
        }
        return s.toString();
    }

    public StringBuffer subtract(String num1,String num2){
        int len1 = num1.length(),len2 = num2.length();
        int i = len1-1,j=len2-1;
        int b =0,rest=0,temp=0;
        StringBuffer buffer = new StringBuffer();
        while (i>=0||j>=0){
            if(j<0){
                temp = (num1.charAt(i)-'0')  -b;
                if(temp<0){
                    rest = temp+10;
                    b=1;
                }else{
                    rest = temp;
                    b=0;
                }
                buffer.append(rest);
            }else {
                temp = num1.charAt(i) - num2.charAt(j) -b;
                if(temp<0){
                    rest = temp+10;
                    b=1;
                }else{
                    rest = temp;
                    b=0;
                }
                buffer.append(rest);
            }
            i--;
            j--;
        }
        return buffer;
    }

    public boolean compare(String num1,String num2){
        int index = 0, len1 = num1.length(), len2 = num2.length();
        if(len1!=len2) return len1>len2?true:false;
        while (index<len1&&index<len2){
            if(num1.charAt(index)>num2.charAt(index)) return true;
            else if(num1.charAt(index)<num2.charAt(index)) return false;
            else index++;
        }
        return true;
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
