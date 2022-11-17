package all._2_removeNthFromEnd;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/5 - 9:25
 */


public class RemoveNthFromEnd {
    public int flag = 0;
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next == null){
            flag++;
            if(flag != n) return head;
            else return null;
        }else{
            ListNode listNode = removeNthFromEnd(head.next, n);
            flag++;
            if(flag==n){
                return listNode;
            }else {
                head.next = listNode;
                return head;
            }
        }

    }
}
