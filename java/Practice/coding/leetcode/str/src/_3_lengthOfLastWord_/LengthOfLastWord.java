package _3_lengthOfLastWord_;

/**
 * @author: cgr
 * @date: 2022/9/2 - 15:39
 */

// easy+

/* 最后一个单词的长度   “hello world” ===>>>  5
*   思路：从后往前遍历
*
* */
public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord l = new LengthOfLastWord();
//        int i = l.lengthOfLastWord("   Hello Woreeld  ");
//        System.out.println(i);
        String s = "   Hello Woreeld  ";
        for (String s1 : s.split(" ")) {
            System.out.println(s1+'-');
        }

    }

    public int lengthOfLastWord(String s) {
        int r =-1,l=-1;
        for(int i = s.length()-1;i>=0;--i){
            if(s.charAt(i) != ' '){
                if(r<0) r=i;
            }else{
                if(r<0) continue;
                else{
                    l = i;
                    break;
                }
            }
        }
        System.out.println(r+"--"+l);
        return r-l;
    }
}
