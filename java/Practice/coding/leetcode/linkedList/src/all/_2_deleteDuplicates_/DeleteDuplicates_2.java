package all._2_deleteDuplicates_;

/**
 * @author: cgr
 * @date: 2022/9/5 - 9:33
 */


/*  链表中数重复则删除这类节点
*
*
* */
public class DeleteDuplicates_2 {
    public int record = 0;
    public boolean flag;
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            record = head.val;
            return head;
        }
        ListNode listNode = deleteDuplicates(head.next);
        if(head.val == record){
            if(listNode==null){
                return listNode;
            }
            else {
                if(listNode.val == record){ return listNode.next;}
                else return listNode;
            }
        }else {
            record = head.val;
            head.next = listNode;
            return head;
        }
    }
}
