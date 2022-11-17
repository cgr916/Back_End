package _2_nextGreaterElement_$d;

/**
 * @author: cgr
 * @date: 2022/9/15 - 21:20
 */

/*  下一个更大的元素  (下一个排列)
*   思路：反向查找非降序的数n1，再反向查找比n1大的数n2，交换n1，n2的位置，并将n1后的数反转；
*   理解：
*       1、降序排列意味着数比较大，此时非降序的就是突破口n1
*       2、由于后面的都是降序，因此从后找起，比他大的就是最接近n1且大于n1的
*       3、再反转是因为之前为降序排列，因此反转则变为最小，而n1已经改变，故此时最接近
*
*   注意点：n1在获取时注意其是否为  负数
* */

public class NextGreaterElement {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("31".compareTo("13"));
    }

    public int nextGreaterElement(int n) {
        String s = String.valueOf(n);
        int len = s.length(),n1=0,n2=0;
        for (int i =len-2;i>=0;--i){
            if(s.charAt(i)<s.charAt(i+1)) n1=i;
        }
        for (int i = len-1;i>=0;--i){
            if(s.charAt(i)>s.charAt(n1)) n2=i;
        }
        String swap = swap(s, n1, n2);
        String reverse = reverse(swap, n1 + 1, len - 1);
        if(reverse.compareTo(s)>0 && reverse.compareTo(String.valueOf(Integer.MAX_VALUE))<=0)
        return Integer.parseInt(reverse);
        else return -1;
    }

    public String swap(String s,int l,int r){
        StringBuffer buffer = new StringBuffer(s);
        char cl = buffer.charAt(l);
        char cr = buffer.charAt(r);
        buffer.setCharAt(l,cr);
        buffer.setCharAt(r,cl);
        return buffer.toString();
    }

    public String reverse(String s,int l,int r){
        StringBuffer buffer = new StringBuffer(s);
        int i = l,j=r;
        while (i<j){
            char cl = buffer.charAt(i);
            char cr = buffer.charAt(j);
            buffer.setCharAt(i,cr);
            buffer.setCharAt(j,cl);
            i++;
            j--;
        }
        return buffer.toString();
    }



}
