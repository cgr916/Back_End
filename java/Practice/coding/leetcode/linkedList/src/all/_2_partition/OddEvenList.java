package all._2_partition;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/10/3 - 14:56
 */

/*  奇偶分区：
*   重点在于标记奇数对应的 尾巴节点
*
*
* */

public class OddEvenList {
    public int flag = 0;
    public ListNode tail;
    public ListNode temp;
    public static void main(String[] args) {
        System.out.println();
    }

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        flag++;
        if (head.next == null) {
            if(flag%2 == 0) return head;
            else {
                tail = head;
                return head;
            }
        }
        ListNode node = oddEvenList(head.next);
        if(flag%2 == 0){
            temp = tail.next;
            tail.next = head;
            head.next = temp;
            return node;
        }else {
            head.next = node;
            return head;
        }
    }
}
