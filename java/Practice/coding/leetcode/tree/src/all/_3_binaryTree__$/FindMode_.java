package all._3_binaryTree__$;

import all.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/10/9 - 16:30
 */

/*  寻找二叉搜索树中的众数
*   中序遍历 + 边比较边淘汰
*
* */

public class FindMode_ {
    public List<Integer> list = new ArrayList<>();
    int count,base,maxCount;
    public static void main(String[] args) {

    }

    public int[] findMode(TreeNode root) {
        inorder(root);
        int size = list.size();
        int[] res = new int[size];
        for (int i = 0; i < size; ++i) {
            res[i] = list.get(i);
        }
        return res;
    }

    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        if (root.val == base) {
            ++count;
        } else {
            count = 1;
            base = root.val;
        }
        if (count == maxCount) {
            list.add(base);
        }
        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(base);
        }
        inorder(root.right);
    }
}
