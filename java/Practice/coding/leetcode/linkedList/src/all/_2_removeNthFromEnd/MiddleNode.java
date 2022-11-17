package all._2_removeNthFromEnd;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/17 - 19:20
 */
public class MiddleNode {
    public ListNode begin;
    public ListNode record;
    public static void main(String[] args) {
        System.out.println();
    }

    public ListNode middleNode(ListNode head) {
        begin = head;
        helper(head);
        return record;
    }

    public void helper(ListNode head){
        if(head.next==null){
            if (head == begin || begin.next==head) {
                record = head;
            }else begin = begin.next;
            return;
        }
        helper(head.next);
        if (head == begin || begin.next==head) {
            record = head;
        }else begin = begin.next;
    }

}
