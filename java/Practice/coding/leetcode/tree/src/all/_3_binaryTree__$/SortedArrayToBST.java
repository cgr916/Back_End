package all._3_binaryTree__$;

import all.TreeNode;

/**
 * @author: cgr
 * @date: 2022/10/9 - 14:15
 */
public class SortedArrayToBST {
    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int len = nums.length;
        return buildTree(nums,0,len-1);
    }

    public TreeNode buildTree(int[] nums, int l, int r) {
        if(l>r) return null;
        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildTree(nums, l, mid - 1);
        root.right = buildTree(nums, mid + 1, r);
        return root;
    }
}
