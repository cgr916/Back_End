package _0_begin;

/**
 * @author: cgr
 * @date: 2022/10/28 - 11:16
 */
public class Introduction {
    public static void main(String[] args) {

        int[] nums = new int[]{1,2,3,4,6,8,9,3,5,7};
        int xor = 0;
        for (int n:nums){
            xor ^= n;
        }
        System.out.println(xor);
        System.out.println(1^1);
        System.out.println(3^3);
        System.out.println(7^7);
    }

    public int BM(String str,String pattern){
        int pLen = pattern.length(),sLen = str.length();
        int i = pLen - 1, j = pLen - 1;
        int suffixLen = 0;
        while (j < sLen){

        }
        return  0;
    }

    public void badChar(){

    }

    public void  goodSuffix(){

    }
}
