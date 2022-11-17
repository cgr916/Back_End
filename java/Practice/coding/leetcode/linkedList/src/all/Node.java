package all;

/**
 * @author: cgr
 * @date: 2022/9/5 - 10:13
 */
public class Node {
        public int val;
        public Node next;
        public Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
}
