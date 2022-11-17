package all._3_updateTree__;

import all.TreeNode;

/**
 * @author: cgr
 * @date: 2022/9/5 - 13:23
 */

/*  合并二叉树
*   思路：如果两个二叉树存在左右节点，就继续往下 null 节点的那个对应 0 值
*
*
* */
public class DiameterOfBinaryTree {
    public int count;
    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return count;
    }

    public int getLen(TreeNode root){
        if(root==null) return 0;
        return Math.max(getLen(root.left)+1, getLen(root.right)+1);
    }

    public void helper(TreeNode root){
        if(root==null) return;
        count = Math.max(count, getLen(root.left) + getLen(root.right));
        helper(root.left);
        helper(root.right);
    }


}
