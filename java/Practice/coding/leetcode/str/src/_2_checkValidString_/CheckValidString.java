package _2_checkValidString_;

/**
 * @author: cgr
 * @date: 2022/9/14 - 23:31
 */

// medium

/*  检查字符串括号合法性   (*) (**) ())*  ==>>>  true,true,false
*   维护一个最大值与最小值用于表示左括号的最多/最少个数
*   ( min max 同时加
*   ) max减少(最小为0)  min减少(最小为0)
*   * max加  min减少(最小为0)
*   如果 min为0 则正确
* */
public class CheckValidString {
    public static void main(String[] args) {
        System.out.println();
    }

    public boolean checkValidString(String s) {
        int length = s.length();
        if (length==0) return true;
        int i = 0,count = 0,r=0;
        while (i<length){
            if(s.charAt(i)=='(') count++;
            else if(s.charAt(i)==')'){
                if(count+r-1<0) return false;
                if(count>0) count--;
                else if(count==0){
                    r--;
                }
            }else r++;
        }
        return true;
    }
}
