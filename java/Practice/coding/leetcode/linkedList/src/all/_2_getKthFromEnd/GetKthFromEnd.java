package all._2_getKthFromEnd;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/17 - 10:02
 */

/*  倒数第k个节点
*
*
* */
public class GetKthFromEnd {
    public int flag;
    public ListNode node;
    public static void main(String[] args) {

    }

    public ListNode getKthFromEnd(ListNode head, int k) {
        helper(head,k);
        return node;
    }

    public void helper(ListNode head,int k){
        if (head == null || head.next == null) {
            flag = 1;
            if(flag == k) node = head;
            return;
        }
        helper(head.next, k);
        flag++;
        if(flag==k){
            node = head;
        }
        return ;
    }
}
