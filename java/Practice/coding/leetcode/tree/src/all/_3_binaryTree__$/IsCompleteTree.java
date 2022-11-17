package all._3_binaryTree__$;

import all.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/10/10 - 17:09
 */

/*  二叉搜索树完全性验证
*   注意点：1、左节点没有时做标记，其后存在任意节点均为 false
*          2、层级数不满足时：判断是否该层节点数为 0 ？
*                           为0：  true
*                           不为0：判断上一层级节点数是否满足？
*                                       满足：continue；
*                                       不满足：false；
* */

public class IsCompleteTree {
    public static void main(String[] args) {

    }

    public boolean isCompleteTree(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        boolean prev = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            if(size == (1 << level)) prev = true;
            else prev = false;
            level++;
            for (int i = 0; i < size; ++i) {
                TreeNode poll = queue.poll();
                if(poll.left != null) queue.offer(poll.left);
                else {
                    if(poll.right != null) queue.offer(poll.right);
                    else return false;
                }
            }
            if(size == (1<<level)) continue;
            else return prev;
        }
        return false;
    }
}
