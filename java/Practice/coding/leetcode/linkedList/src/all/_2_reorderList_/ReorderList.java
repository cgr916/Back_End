package all._2_reorderList_;

import all.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/17 - 17:09
 */

/*  将链表按照 索引值 0 n 1 n-1...顺序进行组合
*
*
* */

public class ReorderList {
    public static void main(String[] args) {
        System.out.println();
    }

    public void reorderList(ListNode head) {
        ListNode temp = head;
        if(head==null || head.next==null) return;
        Deque<ListNode> stack = new LinkedList<>();
        while (temp!=null){
            stack.push(temp);
            temp = temp.next;
        }
        temp = head;
        ListNode tmp = temp.next;
        ListNode cur = stack.peek();
        while (temp!=null){
            if(cur!=tmp && temp!=cur){
                temp.next = stack.pop();
                cur.next = tmp;
            }else {
                if(cur == tmp){
                    tmp.next = null;
                }else if(cur == temp){
                    temp.next = null;
                }
                break;
            }
            temp = tmp;
            tmp = temp.next;
            cur = stack.peek();
        }
    }


}
