package _2_permutations__$;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/30 - 14:27
 */

/*  子集：[1,2]  ==>  [[],[1],[2],[1,2]]
*
*
* */
public class Subsets {
    public List<List<Integer>> lists = new ArrayList<>();
    public static void main(String[] args) {

    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        helper(list,nums,0,0);
        return lists;
    }

    public void helper(List<Integer> list,int[] nums,int index,int num){
        if(list.size() == num) lists.add(new ArrayList<>(list));
        for(int i = index;i<nums.length;++i){
            list.add(nums[i]);
            helper(list,nums,i+1,num+1);
            list.remove(list.size()-1);
        }
    }
}
