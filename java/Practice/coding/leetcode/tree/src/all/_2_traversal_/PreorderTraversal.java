package all._2_traversal_;

import all.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/5 - 13:20
 */
public class PreorderTraversal {
    public List<Integer> list = new ArrayList<>();
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        helper(root);
        return list;
    }

    public void helper(TreeNode root) {
        if(root==null) return;
        list.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
