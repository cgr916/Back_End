package all._2_pathSum;

import all.TreeNode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/5 - 21:50
 */
public class PathSum {
    Deque<List<Integer>> pre = new LinkedList<>();
    List<List<Integer>> lists = new ArrayList<List<Integer>>();
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        PathSum pathSum = new PathSum();
        List<List<Integer>> lists = pathSum.pathSum(treeNode, 10);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println("--------");
        }


    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>(pre);
        return lists;
    }

    public void bfs(TreeNode root){
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            System.out.println(size);
            for (int i = 0;i<size;++i){
                TreeNode poll = queue.poll();
                List<Integer> prePoll = new ArrayList<>();
                if(pre.size() != 0) {
                    prePoll = pre.poll();
                }
                if(poll.left == null&&poll.right==null){
                    List<Integer> temp = new ArrayList<>();
                    temp.addAll(prePoll);
                    temp.add(poll.val);
                    lists.add(temp);
                    System.out.println("hello");
                }
                if(poll.left!=null){
                    queue.offer(poll.left);
                    List<Integer> ls = new ArrayList<>();
                    if(pre.size() == 0){
                        ls.add(poll.val);
                        pre.offer(ls);
                    }else {
                        ls.addAll(prePoll);
                        ls.add(poll.val);
                        pre.offer(ls);
                    }
                }
                if(poll.right!=null) {
                    queue.offer(poll.right);
                    List<Integer> rs = new ArrayList<>();
                    if(pre.size() == 0){
                        rs.add(poll.val);
                        pre.offer(rs);
                    }else {
                        rs.addAll(prePoll);
                        rs.add(poll.val);
                        pre.offer(rs);
                    }
                }
            }
        }
    }
}
