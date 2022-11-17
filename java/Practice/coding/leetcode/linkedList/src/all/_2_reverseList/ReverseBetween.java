package all._2_reverseList;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/17 - 10:14
 */
public class ReverseBetween {
    public static void main(String[] args) {
        System.out.println();
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        Deque<Integer> stack = new LinkedList<>();
        ListNode temp=head,tmp = head;
        int i = 1;
        while (temp!=null){
            temp = temp.next;
            i++;
            if(i>=left && i<=right){
                stack.push(temp.val);
            } else if(i>right) break;
        }
        int j =1;
        while (tmp!=null){
            tmp = tmp.next;
            j++;
            if(j>=left && j<=right){
                tmp.val = stack.pop();
            }
        }
        return head;
    }

    public ListNode reverse(ListNode node,ListNode head,ListNode tail){
        if (node == null || node.next == null) {
            return node;
        }
        ListNode reverse = reverse(node.next, head, tail);
        node.next.next = node;
        if(node == head){
            node.next = tail;
        }else {
            node.next = null;
        }
        return reverse;
    }

}
