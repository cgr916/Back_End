package _3_addBinary;

/**
 * @author: cgr
 * @date: 2022/9/9 - 14:39
 */

// easy

/* 二进制字符串数相加  111 11 ==>>> 1001
*   思路：从字符尾部开始
*       分三种情况进行讨论，同时对收尾工作进行讨论
*
*
*
* */
public class AddBinary {
    public static void main(String[] args) {
        AddBinary addBinary = new AddBinary();
        String s = addBinary.addBinary("11", "1");
        System.out.println(s);
    }

    public String addBinary(String a, String b) {
//        //
//        int num1 = Integer.parseInt(a,2);
//        int num2 = Integer.parseInt(b,2);
//        return Integer.toBinaryString(num1 + num2);
        int len1 = a.length(), len2 = b.length();
        int i = len1, j = len2;
        char c ='0';
        StringBuffer buffer = new StringBuffer(Math.max(len1, len2));

        while (i>0 || j>0){
            i--;
            j--;
            if(i<0){

                buffer.append(b.charAt(j));
            }else if(j<0){
                buffer.append(a.charAt(i));
            }else{
                switch (c){
                    case '0':
                        if (a.charAt(i) == b.charAt(j)) {
                            if(a.charAt(i)=='0'){
                                c='0';
                                buffer.append('0');
                            }else{
                                c='1';
                                buffer.append('0');
                            }
                        }else{
                            c = '0';
                            buffer.append('1');
                        }
                    break;
                    case '1':
                        if (a.charAt(i) == b.charAt(j)) {
                            if(a.charAt(i)=='0'){
                                c='0';
                                buffer.append('1');
                            }else{
                                c='1';
                                buffer.append('1');
                            }
                        }else{
                            c = '1';
                            buffer.append('0');
                        }
                    break;
                }
            }
        }
        if(c=='1') buffer.append(c);
        return buffer.reverse().toString();
    }



}
