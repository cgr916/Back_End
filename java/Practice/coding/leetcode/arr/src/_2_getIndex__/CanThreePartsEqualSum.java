package _2_getIndex__;

/**
 * @author: cgr
 * @date: 2022/9/28 - 22:57
 */
public class CanThreePartsEqualSum {
    public static void main(String[] args) {

    }

    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        if(sum%3 != 0) return false;
        int target = sum/3;
        int l = 0,r = arr.length-1;
        sum = 0;
        while (l<r){
            sum += arr[l];
            if (sum == target) break;
            l++;
        }
        sum = 0;
        while (r>0){
            sum += arr[r];
            if (sum == target) break;
            r++;
        }
        return r - l > 1 ? true : false;
    }
}
