package all._3_binaryTree__$;

import all.TreeNode;

/**
 * @author: cgr
 * @date: 2022/10/9 - 9:44
 */
public class HasPathSum {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum, 0);
    }

    public boolean helper(TreeNode root,int target,int sum){
        if(root == null) return false;
        if(root.left == null && root.right == null){
            if(root.val + sum == target) return true;
            else return false;
        }
        sum += root.val;
        return helper(root.left,target,sum) || helper(root.right,target,sum);
    }
}
