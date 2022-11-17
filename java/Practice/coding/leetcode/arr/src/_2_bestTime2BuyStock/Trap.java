package _2_bestTime2BuyStock;

/**
 * @author: cgr
 * @date: 2022/10/2 - 21:42
 */

/*  接雨水：求所接雨水的容量
*
* */

public class Trap {
    public static void main(String[] args) {
        System.out.println();
    }

    public int trap(int[] height) {
        int len = height.length,capacity = 0;
        int l = 0;
        while(height[l] == 0) l++;
        for (int r = l + 1; r < len; ++r) {
            if(height[r] > height[l]){
                int temp = (l-r-1)*Math.min(height[l],height[r]);
                for (int i = l + 1; i < r; ++i) {
                    temp-=height[i];
                }
                capacity += temp;
                l = r;
            }
        }
        return capacity;
    }
}
