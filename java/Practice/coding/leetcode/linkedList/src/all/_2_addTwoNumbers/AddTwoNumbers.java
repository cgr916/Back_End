package all._2_addTwoNumbers;

import all.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/5 - 10:52
 */

/*  两链表相加
*   思路：用栈来存储链表中的数，生成新链表来处理
*
* */
public class AddTwoNumbers {
    public int sum;
    public int flag;
    public static void main(String[] args) {

    }


    public ListNode addTwoNumber(ListNode l1, ListNode l2) {
        int s = 0,c = 0;
        ListNode head = null;
        ListNode temp = null;
        while (l1 != null || l2 != null){
            if(l1!=null && l2!=null){
                s = (c + l1.val + l2.val) % 10;
                c = (c + l1.val + l2.val) / 10;
            }else if(l1==null){
                s = (c + l2.val) % 10;
                c = (c + l2.val) / 10;
            }else {
                s = (c + l1.val) % 10;
                c = (c + l1.val) / 10;
            }
            if(head == null) {
                head = new ListNode(s);
                temp = head;
            }else {
                temp.next = new ListNode(s);
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if(c!=0) temp.next = new ListNode(c);
        return head;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*if(l1.next==null || l2.next==null){
            if(flag==0){
                if(l1.next==null) flag=2;
                else flag=1;
            }
            return l1.next==null?l1:l2;
        }
        ListNode ln1 = addTwoNumbers(l1.next, l2);
        ListNode ln2 = addTwoNumbers(l1, l2.next);
        sum = (ln1.val+ln2.val)/10;
        if(flag==1){
            l1.next.val = (ln1.val+ln2.val)%10;
            l1.val+=sum;
            return l1;
        }else {
            l2.next.val = (ln1.val+ln2.val)%10;
            l2.val += sum;
            return l2;
        }*/

//        Deque<Integer> stack1 = new LinkedList<>();
//        Deque<Integer> stack2 = new LinkedList<>();
//        while (l1!=null){
//            stack1.push(l1.val);
//            l1=l1.next;
//        }
//        while (l2!=null){
//            stack1.push(l2.val);
//            l2=l2.next;
//        }
//        int i=stack1.pop(),j=stack2.pop();
//        int c=(i+j)%10,s=(i+j)/10;
//        ListNode head = new ListNode(c);
//        ListNode temp = head;
//        while (!stack1.isEmpty() || !stack2.isEmpty()){
//            if(stack1.isEmpty()) i=0;
//            else i=stack1.pop();
//            if(stack2.isEmpty()) j=0;
//            else j=stack2.pop();
//            c = (s + i + j) % 10;
//            s = (s + i + j) / 10;
//            temp.next = new ListNode(c);
//            temp = temp.next;
//        }
//        if(s!=0) temp.next = new ListNode(s);
//        return reverse(head);

        // 2

        int i=0,j=0,c=0,s=0;
        i = l1.val;
        j = l2.val;
        s = (s+i+j)/10;
        c = (s+i+j)%10;
        ListNode head = new ListNode(c);
        ListNode temp = head;
        l1 = l1.next;
        l2 = l2.next;
        while (l1!=null||l2!=null){
            if(l1==null){
                j = l2.val;
                s = (s+j)/10;
                c = (s+j)%10;
                temp.next = new ListNode(c);
                temp = temp.next;
                l2 = l2.next;
            }else if(l2==null){
                i = l1.val;
                s = (s+i)/10;
                c = (s+i)%10;
                temp.next = new ListNode(c);
                temp = temp.next;
                l1 = l1.next;
            }else {
                i = l1.val;
                j = l2.val;
                s = (s+i+j)/10;
                c = (s+i+j)%10;
                temp.next = new ListNode(c);
                temp = temp.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        if(s!=0) temp.next = new ListNode(s);
        return head;
    }

    public ListNode reverse(ListNode l){
        if(l==null || l.next==null) return l;
        ListNode node = reverse(l.next);
        l.next.next = l;
        l.next = null;
        return node;
    }

}
