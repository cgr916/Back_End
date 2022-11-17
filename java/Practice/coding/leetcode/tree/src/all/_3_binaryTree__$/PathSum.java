package all._3_binaryTree__$;

import all.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/10/9 - 14:25
 */
public class PathSum {
    List<String> list = new ArrayList<>();
    public static void main(String[] args) {

    }

    public List<String> binaryTreePaths(TreeNode root) {
        helper(root,new StringBuilder());

        return list;
    }

    public void helper(TreeNode root,StringBuilder builder){
        if(root.left == null && root.right == null){
            builder.append(root.val);
            list.add(new String(builder));
            return;
        }
        builder.append(root.val);
        builder.append("->");
        if(root.left != null) helper(root.left,new StringBuilder(builder));
        if(root.right != null) helper(root.right,new StringBuilder(builder));
    }
}
