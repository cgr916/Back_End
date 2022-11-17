package all._2_rightSideView_;

import all.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/5 - 15:23
 */
public class RightSideView {
    public static void main(String[] args) {

    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        bfs(root,lists);
        for (List<Integer> integers : lists) {
            System.out.println("---------");
            for (Integer integer : integers) {
                System.out.print(integer);
            }
        }

        for (int i = 0;i<lists.size();++i){
            int size = lists.get(i).size();
            list.add(lists.get(i).get(size-1));
        }
        return list;
    }

    public void bfs(TreeNode root, List<List<Integer>> lists) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while (!queue.isEmpty()) {
            // size应该要确定下来，不应该随着for语句而发生改变
            if (level == lists.size()) lists.add(new ArrayList<>());
            for (int i = 0; i < queue.size(); ++i) {
                TreeNode poll = queue.poll();
                lists.get(level).add(poll.val);
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            level++;
        }
    }
}
