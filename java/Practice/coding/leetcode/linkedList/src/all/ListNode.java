package all;

/**
 * @author: cgr
 * @date: 2022/9/4 - 22:45
 */
public class ListNode {
    public int val;
    public ListNode next;
    ListNode() {}

    public ListNode(int val) {
       this.val = val;
      }

    ListNode(int val, ListNode next) {
       this.val = val; this.next = next;
    }
}
