package _1_minWindow___s;

/**
 * @author: cgr
 * @date: 2022/9/16 - 14:50
 */

/*  最小交换次数：xx yy ==> xy xy
*   思路：记录 x->y  y->x的交换次数
*
* */

public class MinimumSwap {
    public static void main(String[] args) {

    }

    public int minimumSwap(String s1, String s2) {
        int xy = 0, yx = 0;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        for(int i = 0; i < c1.length; i++){
            if(c1[i] == c2[i]) continue;
            if(c1[i] == 'x') xy++;
            else yx++;
        }
        if(((xy + yx) & 1) != 0) return -1;
        return xy / 2 + yx / 2 + (xy % 2 * 2);
    }
}
