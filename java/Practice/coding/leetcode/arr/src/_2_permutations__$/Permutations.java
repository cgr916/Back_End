package _2_permutations__$;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/3 - 9:31
 */


/*  全排列
*   1、不含重复数字：回溯-》一个一个往里加，满足n个后加入列表
*
*   2、含重复数字：回溯-》加过的不再加(与上同) ，   多加个使用标识数组 vis
*                   后一个与前一个相等时：
*                                       判断前一个是否使用，没有使用就跳转至下一个
*
* */
public class Permutations {
    public static void main(String[] args) {
        Permutations p = new Permutations();
        for (List<Integer> list : p.permutations(new int[]{1, 2, 3})) {
            System.out.println();
        }

    }

    public List<List<Integer>> permutations(int[] nums){
        List<Integer> list = new ArrayList<>(nums.length);
        for(int i = 0;i<nums.length;++i){
            list.add(nums[i]);
        }
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        dfs(lists,list,0);

        return lists;
    }

    public void dfs(List<List<Integer>> lists, List<Integer> list, int j) {

        //此处由于交换会出现冗余
        for (int i = j; i < list.size(); ++i) {
            lists.add(swap(list,j,i));
            dfs(lists,list,j+1);
        }

        //使用计数可能好些：也就是一个一个确定数字
    }

    public List<Integer>  swap(List<Integer> l,int m,int n){
        ArrayList<Integer> list = new ArrayList<>(l);
        int temp = list.get(m);
        list.set(m,list.get(n));
        list.set(n,temp);
        return list;
    }
}
