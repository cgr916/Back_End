package _3_useHash;

import java.util.Arrays;

/**
 * @author: cgr
 * @date: 2022/9/28 - 15:25
 */
public class SortedSquares {
    public static void main(String[] args) {

    }

    public int[] sortedSquares(int[] nums){
        int len = nums.length;
        int[] temp = new int[len];
        for(int i = 0;i < len;++i){
            temp[i] = nums[i]*nums[i];
        }
        Arrays.sort(temp);
        return temp;
    }
}
