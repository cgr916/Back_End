package all._2_buildTree__d;

import all.TreeNode;
import all._2_traversal_.PreorderTraversal;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/5 - 14:04
 */
public class BuildTree {
    public int[] inorder;
    public int[] postorder;
    public int index;
    public static void main(String[] args) {

        BuildTree buildTree = new BuildTree();
        TreeNode root = buildTree.buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3});
        PreorderTraversal preorderTraversal = new PreorderTraversal();
        preorderTraversal.preorderTraversal(root);
        for (Integer integer : preorderTraversal.list) {
            System.out.println(integer);
        }

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        int len = inorder.length;
        this.index = len-1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0;i<len;++i){
            hm.put(inorder[i],i);
        }
        return helper(hm,0,len-1);
    }

    public TreeNode helper(HashMap<Integer, Integer> hm, int l, int r) {
        if(l>r||index<0) return null;
        int item = this.postorder[index];
        TreeNode root = new TreeNode(item);
        int f = hm.get(item);
        index--;
        root.right = helper(hm, f + 1, r);
        root.left = helper(hm, l, f - 1);
        return root;
    }

}
