package all._2_removeNthFromEnd;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/17 - 19:16
 */
public class RemoveElements {
    public static void main(String[] args) {

    }

    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        if(head.next ==null){
            if(head.val == val) return head.next;
            else return head;
        }
        ListNode listNode = removeElements(head.next, val);
        if(head.val==val)return listNode;
        else {
            head.next = listNode;
            return head;
        }
    }
}
