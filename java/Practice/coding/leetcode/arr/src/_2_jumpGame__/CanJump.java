package _2_jumpGame__;

/**
 * @author: cgr
 * @date: 2022/9/19 - 15:50
 */
public class CanJump {
    public static void main(String[] args) {

    }

    public boolean canJump(int[] nums) {
        int len = nums.length;
        int max = 0,end=0;
        for(int i = 0;i<len;++i){
            max = Math.max(max,nums[i]+i);
            if(i==end){
                end = max;
                if(end >= len-1) return true;
            }
        }
        return false;
    }

}
