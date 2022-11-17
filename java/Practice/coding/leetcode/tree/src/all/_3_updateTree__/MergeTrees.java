package all._3_updateTree__;

import all.TreeNode;

/**
 * @author: cgr
 * @date: 2022/9/5 - 13:10
 */
public class MergeTrees {
    public static void main(String[] args) {

    }

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null||root2==null) return root1==null?root2:root1;
        TreeNode treeNode = new TreeNode(root1.val + root2.val);

        treeNode.left = mergeTrees(root1.left,root2.left);
        treeNode.right = mergeTrees(root1.right,root2.right);
        return treeNode;
    }

}
