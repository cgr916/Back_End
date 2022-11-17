package _2_permutations__$;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/19 - 16:15
 */

/*  含重复数字全排列
*
*   创建数组 vis[] 用于标识数字是否被使用,
*   排序后，逐个放入未标识的,
*           当遇到与前一项相同，且前一项未使用：跳过
*           否则，添加
*
* */
public class PermuteUnique {
    public List<List<Integer>> lists = new ArrayList<>();
    public boolean[] vis;
    public static void main(String[] args) {

    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        int len = nums.length;
        vis = new boolean[len];
        Arrays.sort(nums);
        backtrack(new ArrayList<Integer>(),nums,0,len);
        return lists;
    }

    public void backtrack(List<Integer> list,int[] nums,int cnt,int len){
        if(cnt == len-1){
            lists.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0;i<len;++i){
            if(vis[i] || (i>0 && nums[i]==nums[i-1] && !vis[i-1])){
                continue;
            }
            list.add(nums[i]);
            vis[i] = true;
            backtrack(list,nums,cnt+1,len);
            list.remove(cnt);
            vis[i] = false;
        }

    }


}
