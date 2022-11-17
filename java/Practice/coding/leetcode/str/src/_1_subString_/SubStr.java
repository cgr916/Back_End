package _1_subString_;

/**
 * @author: cgr
 * @date: 2022/9/2 - 13:04
 */

// medium

/*  是否为其子串  defrfrabcdefg  abcd  ==>>> true
*   思路 KMP算法  ==>> next数组
*   1、正常比对，如不同借助next数组进行跳转，提高效率
*   2、next数组：-1，0，
*
* */

public class SubStr {
    //KMP算法
    public static void main(String[] args) {
        SubStr str = new SubStr();
        boolean b = str.isSubStr("dqwxqwadsadswefwef", "xqwadsa");
        System.out.println(b);
    }

    //判断str2是否为str1的子串
    public boolean isSubStr(String str1,String str2) {
        int i =0,j=0;
        int[] next = new int[str2.length()];
        next[0]=-1;
        next[1]=0;
        getNext(str2,next);
        for (int arr : next) {
            System.out.print(arr+"  ");
        }

        while (i<str1.length() && j<str2.length()){
            if(str1.charAt(i) == str2.charAt(j)){
                i++;
                j++;
            }else if(j==0){
                //
                i++;
            } else{
                j = next[j];
            }
        }
        return j==str2.length() ? true:false;
    }

    //
    public void getNext(String str,int[] next){
        int cn = 0;
        int i = 2;
        while(i<next.length){
            //需要引入一个变量
            if(str.charAt(i-1)==str.charAt(cn)) next[i++] = ++cn;
            else if(cn>0) cn=next[cn];
            else next[i++] = 0;
        }
    }


}
