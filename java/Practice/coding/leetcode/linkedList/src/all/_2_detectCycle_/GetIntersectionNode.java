package all._2_detectCycle_;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/17 - 19:03
 */

/* 链表相交
*
*
* */
public class GetIntersectionNode {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int flag = 0;
        ListNode tmpA = headA,tmpB = headB;
        while (flag<3){
            if(tmpA==tmpB) return tmpA;
            if(tmpA.next==null) {
                tmpA = headB;
                flag++;
            }
            else tmpA = tmpA.next;
            if(tmpB.next==null) {
                tmpB = headA;
                flag++;
            }
            else tmpB = tmpB.next;
        }
        return null;
    }
}
