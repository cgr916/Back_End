package all._2_detectCycle_;

import all.ListNode;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/4 - 23:40
 */
public class DetectCycle {
    public static void main(String[] args) {

    }

    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
          // 快慢指针做法需要引入  第三个指针

//        ListNode slow = head,fast= head;
//        while (slow != null && fast!=null){
//            slow = slow.next;
//            fast = fast.next.next;
//            if(slow == fast) return slow;
//        }
//        return null;
        HashMap<ListNode, Integer> hm = new HashMap<>();
        int i = 0;
        while(head!=null && !hm.containsKey(head)){
            hm.put(head,i++);
            head = head.next;
        }
        return head;
    }
}
