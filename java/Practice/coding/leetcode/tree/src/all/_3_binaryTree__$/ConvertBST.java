package all._3_binaryTree__$;

import all.TreeNode;

/**
 * @author: cgr
 * @date: 2022/10/9 - 20:53
 */
public class ConvertBST {


    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            sum += root.val;
            root.val = sum;
            convertBST(root.left);
        }
        return root;
    }
}
