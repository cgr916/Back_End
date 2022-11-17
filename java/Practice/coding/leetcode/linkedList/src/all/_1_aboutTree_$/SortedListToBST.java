package all._1_aboutTree_$;

import all.ListNode;
import all.TreeNode;


/**
 * @author: cgr
 * @date: 2022/10/3 - 19:13
 */

/*  有序链表构造 bts(二叉搜索树)
*   中序遍历优化：先建一颗不指明值的树，
*               待左子树遍历完成后，将头节点值赋值给该左子树节点
*
*
* */
public class SortedListToBST {
    public static void main(String[] args) {

    }

    public TreeNode sortedListToBST(ListNode head) {
        TreeNode treeNode = helper(head, null);
        return treeNode;
    }

    public TreeNode helper(ListNode head, ListNode tail) {
        if(head == tail) return null;
        ListNode node = getMiddle(head, tail);
        TreeNode root = new TreeNode(node.val);
        root.left = helper(head, node);
        root.right = helper(node.next, tail);
        return root;
    }

    public ListNode getMiddle(ListNode head, ListNode tail) {
        if(head == null) return null;
        if(head == tail) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != tail && fast.next.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
