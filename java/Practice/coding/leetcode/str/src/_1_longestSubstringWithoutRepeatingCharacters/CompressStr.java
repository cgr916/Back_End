package _1_longestSubstringWithoutRepeatingCharacters;

/**
 * @author: cgr
 * @date: 2022/9/15 - 20:45
 */

//  easy

/*  压缩字符串
*   前提：该字符串是一组一组的
*   思路：边统计边修改
*
* */
public class CompressStr {
    public static void main(String[] args) {
        char c= '0';
        System.out.println((char)('0'+3));

    }

    public int compress(char[] chars) {
        char curChar = chars[0];
        int count = 1, len = chars.length,index=0;
        for(int i = 1;i<len;++i){
            if(chars[i]==curChar){
                count++;
            }else {
                chars[index++]=curChar;
                if(count>1){
                    if(count<10) chars[index++] = (char) (count+'0');
                    else {
                        int l = index;
                        while (count>0){
                            chars[index++] = (char) (count%10+'0');
                            count = count/10;
                        }
                        reverse(chars,l,index-1);
                    }
                }
                curChar = chars[i];
                count = 1;
            }
        }
        chars[index++]=curChar;
        if(count>1){
            if(count<10) chars[index++] = (char) (count+'0');
            else {
                int l = index;
                while (count>0){
                    chars[index++] = (char) (count%10+'0');
                    count = count/10;
                }
                reverse(chars,l,index-1);
            }
        }
        return index;
    }

    public void reverse(char[] chars,int l,int r){
        char temp = chars[l];
        while (l<r){
            chars[l] = chars[r];
            chars[r]=temp;
            temp = chars[++l];
            r--;
        }
    }
}
