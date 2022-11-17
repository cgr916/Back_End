package all._2_mergeTwoLists;

/**
 * @author: cgr
 * @date: 2022/9/4 - 22:55
 */
public class MergeTwoLists {
    public ListNode head;
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null||list2==null) return list1==null?list2:list1;
        if (list1.val <= list2.val){
            ListNode temp = mergeTwoLists(list1.next, list2);
            list1.next = temp;
            return list1;
        }else{
            ListNode temp = mergeTwoLists(list1, list2.next);
            list2.next = temp;
            return list2;
        }
    }

}
