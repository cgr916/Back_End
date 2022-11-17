package _2_twoSum__$;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/28 - 23:05
 */
public class AddToArrayForm_ {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(4);
        integers.add(0);
        integers.add(0);
        integers.add(0);
        integers.add(0);
        integers.set(3, 3);
        integers.set(2, 2);
        integers.set(1, 1);
        integers.set(0, 0);
        integers.remove(0);
        for (Integer integer : integers) {
            System.out.println(integer);
        }
        System.out.println(integers.size()+"---");
    }

    public List<Integer> addToArrayForm(int[] num, int k) {
        int len = num.length;
        List<Integer> list = new ArrayList<>(len+1);
        int rest = 1,mul = 10;
        int s = 0,c = 0;
        for (int i = 0;i<len+1;++i){
            list.add(0);
        }
        for (int i = len-1; i >= 0; --i) {
            int temp = (k%mul)/rest;
            s = (c + temp + num[i]) % 10;
            c = (c + temp + num[i]) / 10;
            list.set(i+1,s);
            mul*=10;
            rest*=10;
        }
        if(c==0) list.remove(0);
        else list.set(0,c);

        return list;
    }


    /*  有效山脉数    必须是严格单调增后再单调减
    *
    *
    * */
    public boolean validMountainArray(int[] arr) {
        int len = arr.length;
        if(len < 3) return false;
        int i = 1;
        for(;i<len;++i){
            if (arr[i] < arr[i - 1]) {
                i = i-1;
                break;
            } else if (arr[i] == arr[i - 1]) return false;
        }
        if(i == len-1) return false;
        for(i=i+1;i<len;++i){
            if (arr[i] >= arr[i - 1]) return false;
        }
        return true;
    }

    /*  折扣后的价格：[8,1,6,2,7,3]  >  [7,1,4,2,5,3]
    *
    * */
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        for(int i = 0;i<len;++i){
            for(int j = i+1;j<len;++j){
                if(prices[j]<=prices[i]){
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    /*  连续1的个数
    *
    * */
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt = 0,maxCnt = 0,len = nums.length;
        for (int i = 0;i<len;++i){
            if(nums[i] == 1) cnt++;
            else {
                maxCnt = Math.max(cnt,maxCnt);
                cnt = 0;
            }
        }
        if(cnt > 0) return Math.max(maxCnt,cnt);
        return maxCnt;
    }


    /*  0-n中缺少的数字
    *
    *
    * */
    public int missingNumber(int[] nums) {
        int len = nums.length;
        for(int i = 0;i<len;++i){
            if(nums[i] != i) return i;
        }
        return len;
    }


    /*  将数组元素替换成右侧最大值
    *       逆序遍历   空间换时间 => 新建一个数组 ans[] 用于存储
    *
    * */
    public int[] replaceElements(int[] arr) {
        int len = arr.length,tmp = 0;
        for (int i = 0; i < len; ++i) {
            for (int j = i + 1; j < len; ++j) {
                tmp = Math.max(tmp,arr[j]);
            }
            if (i==len-1) arr[i] = -1;
            else{
                arr[i] = tmp;
                tmp = 0;
            }
        }
        return arr;
    }
}
