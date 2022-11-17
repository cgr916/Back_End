package all._2_lowestCommonAncestor_;

import all.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/5 - 21:29
 */

/*  最近祖先节点
*   1、hasMap记录
*   2、前序遍历 + 节点记录
* */

public class LowestCommonAncestor {
    public List<TreeNode> record;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.clear();
        list.add(2);
        list.add(1);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println(list.contains(1));
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    return null;
    }

    public void getAncestor(List<TreeNode> r,TreeNode root,TreeNode node){
        record.clear();
        if(root.left==null && root.right==null) return;
        if(node==root){
            r.add(root);
            record.addAll(r);
            return;
        }
        record.add(root);
        if(root.left!=null) getAncestor(new ArrayList<>(r),root.left,node);
        if(root.right!=null) getAncestor(new ArrayList<>(r),root.right,node);
        return;
    }


}
