package all._2_traversal_;

import all.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/5 - 13:01
 */
public class InorderTraversal {
    public List<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {

    }

    public void inorderTraversal(TreeNode root) {
        if (root ==null || root.left==null||root.right==null) return;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
    }
}
