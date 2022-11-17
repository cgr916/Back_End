package all._3_deleteNode_$;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author: cgr
 * @date: 2022/9/4 - 23:19
 */


/*  删除节点(不给头节点)  只需进行操作即可  1->2->3->4 (3)  使原链表变为 1->2->4
 *
 *
 * */
public class DeleteNode {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        Iterator<Object> iterator = hs.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    public void deleteNode(ListNode node) {
        while (node.next != null){
            node.val = node.next.val;
            node = node.next;
        }
        node = null;
    }
}
