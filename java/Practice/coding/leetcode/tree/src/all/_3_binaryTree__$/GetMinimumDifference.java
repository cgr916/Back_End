package all._3_binaryTree__$;

import all.TreeNode;

import java.util.List;

/**
 * @author: cgr
 * @date: 2022/10/9 - 20:24
 */
public class GetMinimumDifference {
    int min = Integer.MAX_VALUE;
    public static void main(String[] args) {

    }

    public int getMinimumDifference(TreeNode root) {
        helper(root, min);
        return min;
    }

    public void inorder(TreeNode node, List<Integer> list){
        if(node == null) return;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }

    public void helper(TreeNode node,int min){
        if((node == null) || node.left == null && node.right == null) return;
        int l = Integer.MAX_VALUE,r = Integer.MAX_VALUE;
        if(node.left != null) l = node.val - node.left.val;
        if(node.right != null) r = node.val - node.right.val;
        min = Math.min(min, Math.min(l, r));
        helper(node.left,min);
        helper(node.right,min);
    }
}

