package all._2_swapPairs;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/17 - 16:58
 */
public class SwapPairs {
    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1) return head;
        ListNode temp = head;
        ListNode begin = head,tmp=null,tail=null;
        int count = 1;
        while (temp != null) {
            if(count%k==0){
                if(begin==head){
                    tail = begin;
                    begin = temp;
                    temp = temp.next;
                    count++;
                    head = reverse(head, begin);
                    begin = temp;
                }else {
                    tmp = begin;
                    begin = temp;
                    temp = temp.next;
                    count++;
                    tail.next = reverse(tmp,begin);
                    tail = tmp;
                    begin = temp;
                }
            }else{
                temp = temp.next;
                count++;
            }
        }
        if(tail != null) {
            tail.next = begin;
        }
        return head;
    }

    public ListNode reverse(ListNode node,ListNode sign){
        if(node == sign) return node;
        ListNode reverse = reverse(node.next, sign);
        node.next.next = node;
        node.next = null;
        return reverse;
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        return reverseKGroup(head, 2);
    }
}
