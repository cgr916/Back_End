package all._1_reverseKGroup__;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/17 - 15:30
 */

/*  K个一组翻转链表：不足K个的
*   注意点，将翻转递归时的参数设置为 k 与 第k个节点
*          注意每次翻转时边界节点
* */

public class ReverseKGroup {
    public static void main(String[] args) {

    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==1)  return head;
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

    public ListNode reverse(ListNode node, ListNode sign) {
        if (node == sign) return node;
        ListNode reverse = reverse(node.next, sign);
        node.next.next = node;
        node.next = null;
        return reverse;
    }
}
