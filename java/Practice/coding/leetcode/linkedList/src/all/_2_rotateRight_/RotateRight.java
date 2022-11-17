package all._2_rotateRight_;

import all.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/17 - 18:09
 */
public class RotateRight {
    public static void main(String[] args) {

    }

    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        Deque<ListNode> stack = new LinkedList<>();
        int count = 0;
        while (temp!=null){
            stack.push(temp);
            count++;
            temp = temp.next;
        }
        temp = stack.peek();
        temp.next = head;
        count = k%count;
        while(count!=0){
            head = stack.pop();
            count--;
        }
        stack.pop().next = null;
        return head;
    }
}
