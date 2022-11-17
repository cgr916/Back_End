package all._2_copyRandomList_;

import all.Node;

import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/9/5 - 10:13
 */


/*  复制带随机指针的链表
*   思路：先将链表构建起来(只含next，不管random)，之后根据hm中进行指定random的值
*
* */
public class CopyRandomList {
    public static void main(String[] args) {

    }

    /*
    * 哈希表中存储的key与value要区分开来
    *
    * */
    public Node copyRandomList(Node head) {
        if(head == null || head.next == null) return head;
        Node node = new Node(head.val);
        node.next = new Node(head.next.val);
        if(head.random!=null) node.random = new Node(head.random.val);
        else node.random = null;
        HashMap<Node,Node> hm = new HashMap<>();
        hm.put(head,head);
        hm.put(head.next,head.next);
        hm.put(head.random,head.random);
        head = head.next;
        Node temp = node.next;
        while (head != null){
            if(hm.containsKey(head.next)) temp.next = hm.get(head.next);
            else{
                hm.put(head.next,head.next);
                temp.next = new Node(head.next.val);
            }
            if(hm.containsKey(head.random)) temp.random = hm.get(head.random);
            else{
                hm.put(head.random,head.random);
                temp.random = new Node(head.random.val);
            }
            head = head.next;
            temp = temp.next;
        }
        return node;
    }
}
