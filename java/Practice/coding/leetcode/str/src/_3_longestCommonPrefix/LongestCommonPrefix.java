package _3_longestCommonPrefix;

/**
 * @author: cgr
 * @date: 2022/9/2 - 16:03
 */

//  easy

/*  最长公共前缀：{"abc","abcd","abcdefg"}=>"abc"
*   思路:创建一个StringBuffer/StringBuilder;
*       以数组首元素为基准，将前缀逐个放入容器中;
*       逐个进行遍历
*
*
* */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String s = "";
        System.out.println(s);
    }

    public String longestCommonPrefix(String[] strs) {
        int len = strs[0].length(),j=0;
        for(int i = 0;i<strs.length;++i){
            len = Math.min(strs[i].length(),len);
        }
        StringBuffer buf = new StringBuffer(len);
        while(j<=len){
            buf.append(j);
            for(int i = 1;i<strs.length;++i){
                if(strs[i].substring(0,j+1).equals(buf.toString())) continue;
                else return buf.toString();
            }
        }

        return buf.toString();
    }
}
