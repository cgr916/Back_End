package _2_buildTree_$;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/19 - 16:11
 */
public class BuildTreeII {
    public int[] preorder;
    public int[] inorder;
    public int len;
    public int index;
    HashMap<Integer,Integer> hm = new HashMap<>();
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        len = preorder.length;
        this.inorder = inorder;
        this.preorder = preorder;
        index = 0;
        for(Integer i:inorder){
            hm.put(i,index++);
        }
        index = 0;
        TreeNode node = helper(0, len - 1);
        return node;
    }

    public TreeNode helper(int l,int r){
        if(l>r || index >len) return null;
        int val = preorder[index];
        TreeNode root = new TreeNode(val);
        int f = hm.get(val);
        index++;
        root.left = helper(l,f-1);
        root.right = helper(f+1,r);
        return root;
    }
}
