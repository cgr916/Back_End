package _3_majorityElement;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/3 - 12:44
 */
public class MajorityElement {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        int n = nums.length;
        int el = nums[0];
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i:nums){
            if(!hm.containsKey(i)){
                hm.put(i,1);
            }else{
                Integer integer = hm.get(i);
                hm.put(i,integer+1);
                if(hm.get(i)>n/2) el =i;
            }
        }
        return el;
    }

}
