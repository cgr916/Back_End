package all._3_updateTree__;

import all.TreeNode;

/**
 * @author: cgr
 * @date: 2022/10/9 - 11:23
 */
public class MirrorTree {
    public static void main(String[] args) {

    }

    public TreeNode mirrorTree(TreeNode root) {
        swap(root);
        return root;
    }

    public void swap(TreeNode root){
        if(root == null) return ;
        TreeNode l = root.left;
        TreeNode r = root.right;
        root.left = r;
        root.right = l;
        swap(root.left);
        swap(root.right);
    }
}
