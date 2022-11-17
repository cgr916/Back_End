package _2_bestTime2BuyStock;

/**
 * @author: cgr
 * @date: 2022/9/19 - 18:50
 */

/*  最大容器
*   思路：双指针
*
*
* */
public class MaxArea {
    public static void main(String[] args) {
        System.out.println();
    }

    public int maxArea(int[] height) {
//        int max = 0, maxLen = 0;
        int len = height.length,res=0;
//        for (int i =1;i<len;++i){
//            max = Math.max(max,getArea(height,maxLen,i));
//            if(height[maxLen]<height[i]) maxLen = i;
//        }
//        return max;
      int l = 0,r = len -1;
      while (l<r){

      }
      return res;
    }

    public int getArea(int[] h,int l,int r){
        return Math.min(h[l], h[r]) * (l - r);
    }

}
