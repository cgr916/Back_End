package all._2_sortList;

import all.ListNode;

import java.util.*;

/**
 * @author: cgr
 * @date: 2022/9/17 - 15:23
 */
public class SortList {
    public static void main(String[] args) {

    }

    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.val);
            temp= temp.next;
        }
        temp = head;
        Collections.sort(list);
        int size = list.size();
        for (int i = 0;i<size;++i){
            temp.val = list.get(i);
            temp = temp.next;
        }
        return head;
    }


}
