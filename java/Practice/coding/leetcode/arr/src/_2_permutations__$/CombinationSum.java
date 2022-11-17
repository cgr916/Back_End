package _2_permutations__$;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/19 - 9:31
 */

/*  组合总和 candidates = [2,3,6,7], target = 7   [[2,2,3],[7]];
*   注意点：去重 ==>
*   思路：先存重复的，等到无法容纳时，返回上一级，存下一个
*
* */

public class CombinationSum {
    List<List<Integer>> lists = new ArrayList<>();
    boolean[] vis;
    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates,new ArrayList<>(),target,0);
        return lists;
    }

    public int sumAll(List<Integer> list) {
        int temp = 0;
        for (Integer num:list){
            temp+=num;
        }
        return temp;
    }

    public void helper(int[] candidates, List<Integer> list,int target,int index){
        if(index == candidates.length || sumAll(list)>target) return;
        if(sumAll(list)==target){
            lists.add(new ArrayList(list));
            return;
        }

        helper(candidates,list,target,index+1);

        if(target-sumAll(list)>=candidates[index]){
            list.add(index);
            helper(candidates,list,target,index);
            list.remove(list.size()-1);
        }
    }

}
