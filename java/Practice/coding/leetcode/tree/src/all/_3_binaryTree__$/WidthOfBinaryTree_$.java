package all._3_binaryTree__$;

import all.TreeNode;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/10/10 - 15:10
 */
public class WidthOfBinaryTree_$ {
    public static void main(String[] args) {
        Deque<Pair<TreeNode,Integer>> queue = new LinkedList<>();
        TreeNode node = new TreeNode(1);
        queue.offer(new Pair<>(node,1));
        queue.poll();
    }

    public int widthOfBinaryTree(TreeNode root) {
        //层序遍历
        Deque<Pair<TreeNode,Integer>> queue = new LinkedList<>();
        int width = 1;
        queue.offer(new Pair<>(root,1));
        int size = 1;
        while (size > 0) {
            size = queue.size();
            for (int i = 0; i < size; ++i) {
                Pair<TreeNode, Integer> pair = queue.poll();
                TreeNode poll = queue.poll().getKey();
                int index = queue.poll().getValue();
                if (poll.left != null) queue.offer(new Pair<>(poll.left,2*index));
                if (poll.right != null) queue.offer(new Pair<>(poll.right,2*index+1));
            }
            width = Math.max(width,queue.getLast().getValue() - queue.getFirst().getValue());
        }
        return width;
    }
}
