package all._3_binaryTree__$;

import all.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/10/9 - 20:17
 */
public class FindTarget_ {
    public static void main(String[] args) {

    }


    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        int l = 0,r = list.size() - 1;
        while (l<r){
            if(list.get(l) + list.get(r) == k) return true;
            else if(list.get(l) + list.get(r) < k) l++;
            else r--;
        }
        return false;
    }

    public void inorder(TreeNode node,List<Integer> list){
        if(node == null) return;
        inorder(node.left,list);
        list.add(node.val);
        inorder(node.right,list);
    }

}
