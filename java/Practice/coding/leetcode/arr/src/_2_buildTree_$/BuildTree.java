package _2_buildTree_$;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/4 - 16:41
 */
public class BuildTree {
    public int[] inorder;
    public int[] postorder;
    public static void main(String[] args) {

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.inorder = inorder;
        this.postorder = postorder;
        int len = inorder.length;
        int index = len-1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<len;++i){
            hm.put(inorder[i],i);
        }


        return helper(hm,index,0,index);
    }

    public TreeNode helper(HashMap<Integer,Integer> hm,int index,int l,int r){
        if(l>r || index < 0) return null;
        int val = postorder[index];
        index--;
        TreeNode treeNode = new TreeNode(val);
        int flag = hm.get(val);
        treeNode.right = helper(hm,index,flag+1,r);
        treeNode.left = helper(hm,index,l,flag-1);
        return treeNode;
    }
}
