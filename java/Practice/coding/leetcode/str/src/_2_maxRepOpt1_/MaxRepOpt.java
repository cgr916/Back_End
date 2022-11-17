package _2_maxRepOpt1_;

/**
 * @author: cgr
 * @date: 2022/9/15 - 13:50
 */

// medium

/*  单个字符重复子串最大长度  ababa  ==>  移动一位  aaabb ==> 3（maxPower的进阶版）
*   思路：模式识别：只有xx*xxxx时使用移动时最佳
*
* */
public class MaxRepOpt {
    public static void main(String[] args) {

    }

    public int maxRepOpt1(String text) {
        int len = text.length(),curCnt=1,res=1,index=0;
        char curChar = text.charAt(0);
        int[] chars = new int[26];
        for(int i=0;i<len;++i){
            chars[text.charAt(i)-'a']++;
        }
        for(int i=1;i<len;++i){
            if(text.charAt(i)==curChar){
                curCnt++;
            }
            else{
                index=i+1;
                while(index<len && text.charAt(index)==curChar){
                    curCnt++;
                    index++;
                }
                if(chars[curChar-'a']>curCnt) curCnt++;
                res = Math.max(res,curCnt);
                curChar = text.charAt(i);
                curCnt = 1;
            }
        }
        if(chars[curChar-'a']>curCnt) curCnt++;
        res = Math.max(res,curCnt);
        return res;
    }

}
