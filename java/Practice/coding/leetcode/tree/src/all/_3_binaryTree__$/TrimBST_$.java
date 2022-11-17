package all._3_binaryTree__$;

import all.TreeNode;

/**
 * @author: cgr
 * @date: 2022/10/9 - 18:57
 */
public class TrimBST_$ {
    public static void main(String[] args) {

    }

    public TreeNode trimBST(TreeNode root, int low, int high) {
        // 删除由根节点引出的子树
        while (root != null){
            if(root.val < low) root = root.right;
            else if(root.val > high) root = root.left;
            else break;
        }
        if(root == null) return null;

        for (TreeNode node = root;node.left != null;){
            if(node.left.val < low){
                node.left = node.left.right;
            }else{
                node = node.left;
            }
        }

        for (TreeNode node = root;node.right != null;){
            if(node.right.val > high){
                node.right = node.right.left;
            }else{
                node = node.right;
            }
        }
        return root;
    }

}
