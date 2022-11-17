package all._3_updateTree__;

import all.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/5 - 13:36
 */
public class InvertTree {
    Deque<Integer> stack = new LinkedList<>();
    public static void main(String[] args) {


    }

    public TreeNode invertTree(TreeNode root) {
        alter(root);
        return root;
    }

    public void swap(TreeNode root) {
        if(root == null) return;
        TreeNode l = root.left;
        TreeNode r = root.right;
        root.left = r;
        root.right = l;
        swap(root.left);
        swap(root.right);
    }

    public void record(TreeNode treeNode){
        if(treeNode == null) return;
        record(treeNode.left);
        stack.push(treeNode.val);
        record(treeNode.right);
    }

    public void alter(TreeNode root) {
        if(root.left ==null && root.right==null) return;
        alter(root.left);
        alter(root.right);
        change(root.left,root.right);
    }

    public void change(TreeNode l,TreeNode r){
        TreeNode t = l;
        l = r;
        r = l;
    }

}
