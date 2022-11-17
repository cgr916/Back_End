package all._2_partition;

import all.ListNode;

/**
 * @author: cgr
 * @date: 2022/9/17 - 19:34
 */

/*  链表分区
*   注意点：i++时注意i为0的情况
*   1、类似冒泡排序解决问题
*   2、递归思想解决，即采用 记录 尾节点 + 递归实现
*
* */
public class Partition {
    public static void main(String[] args) {

    }

    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null) return head;
        int p = swap(head,x);
        while (p!=0){
            p=swap(head,x);
        }
        return head;
    }

    public int swap(ListNode head,int x){
        if(head.next==null){
            return 0;
        }
        int swap = swap(head.next, x);
        if(head.next.val<x&&head.val>=x){
            int temp = head.val;
            head.val = head.next.val;
            head.next.val = temp;
            return swap++;
        }else return swap;
    }

}
