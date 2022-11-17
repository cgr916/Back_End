package all._1_aboutTree_$;

import all.ListNode;
import all.TreeNode;

import java.util.HashSet;

/**
 * @author: cgr
 * @date: 2022/10/3 - 20:02
 */

/*  判断二叉树中是否存在路径 与 链表对应
*
*
* */

public class IsSubPath {
    public ListNode globalHead;
    public static void main(String[] args) {
        long a = 6147483648L;
        System.out.println(a>Integer.MAX_VALUE);
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        globalHead = head;
        return dfs(head,root);
    }

    public boolean dfs(ListNode head, TreeNode root) {
        if(head == null) return true;
        if (root == null) return false;
        if(head.val == root.val)
            return isSubPath(head.next, root.left)
                    || isSubPath(head.next, root.right);
        else
            return isSubPath(globalHead,root.left) ||
                    isSubPath(globalHead,root.right);
    }



}
