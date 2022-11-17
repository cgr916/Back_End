package all._2_deleteDuplicates_;

/**
 * @author: cgr
 * @date: 2022/9/4 - 23:12
 */

/*  删除重复节点
*
*
* */
public class DeleteDuplicates {
    public static void main(String[] args) {

    }


    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode listNode = deleteDuplicates(head.next);
        if(listNode.val == head.val) return listNode;
        // 必须指明head的next
        else return head;
    }

}
