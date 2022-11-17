package all._2_buildTree__d;

import all.TreeNode;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/10/10 - 20:50
 */
public class BuildTreeII {
    public static void main(String[] args) {

    }

    int[] preorder;
    int[] inorder;
    int index = 0;
    HashMap<Integer,Integer> hm = new HashMap();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        this.inorder = inorder;
        this.preorder = preorder;
        for (int i = 0; i < len; ++i) {
            hm.put(inorder[i],i);
        }
        return helper(0,len-1);
    }

    public TreeNode helper(int l,int r){
        if(l>r) return null;
        int num = preorder[index];
        int mid = hm.get(num);
        index++;
        TreeNode root = new TreeNode(num);
        root.left = helper(l,mid-1);
        root.right = helper(mid+1,r);
        return root;
    }

}
