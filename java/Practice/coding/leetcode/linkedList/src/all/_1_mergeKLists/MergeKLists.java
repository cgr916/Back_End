package all._1_mergeKLists;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/5 - 11:53
 */

/*  合并 K 个链表
*   合并两个 -》 合并多个
*
* */

public class MergeKLists {
    public static void main(String[] args) {

    }

    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if (length==0) return null;
        if(length==1) return lists[0];
        ListNode listNode = mergeTwoLists(lists[0], lists[1]);
        for (int i =2;i<length;++i){
            listNode = mergeTwoLists(listNode, lists[i]);
        }
        return listNode;
    }

    public ListNode mergeTwoLists(ListNode list1,ListNode list2) {
        if(list1==null||list2==null) return list1==null?list2:list1;

        if(list1.val< list2.val){
            list1.next = mergeTwoLists(list1.next,list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1,list2.next);
            return list2;
        }
    }

}
