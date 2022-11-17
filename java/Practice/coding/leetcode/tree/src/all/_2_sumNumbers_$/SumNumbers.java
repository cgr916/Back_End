package all._2_sumNumbers_$;

import all.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/5 - 16:04
 */

/*  求根节点到叶节点数字之和
*
*
* */
public class SumNumbers {

    public static void main(String[] args) {

    }

    public int sumNumbers(TreeNode root) {
        if(root==null) return -1;
        List<List<Integer>> lists = new ArrayList<>();
        helper( lists,root,0);
        int lsize = lists.size();
        int sum = 0, l =0,r=0;
        for (int i = 1; i < lists.size(); ++i) {
            int size = lists.get(i-1).size();
            for (int j=0;j<size;++j){

            }
        }





        return sum;
    }

    public int dfs(TreeNode treeNode,int preSum){
        if (treeNode==null) return 0;
        int sum = 10 * preSum + treeNode.val;
        if(treeNode.left==null&&treeNode.right==null) return sum;
        else{
            return dfs(treeNode.left,sum)+dfs(treeNode.right,sum);
        }
    }

    public void helper(List<List<Integer>> lists,TreeNode root, int level) {
        if(lists.size() == level) lists.add(new ArrayList<>());
        if (root.left == null && root.right == null){
            return;
        }
        lists.get(level).add(root.val);
        if(root.left != null) helper(lists,root.left,level+1);
        else helper(lists,new TreeNode(-1),level+1);
        if(root.right != null) helper(lists,root.right,level+1);
        else helper(lists,new TreeNode(-1),level+1);
    }

}
