package all._3_binaryTree__$;

import all.TreeNode;

import java.util.ArrayList;

/**
 * @author: cgr
 * @date: 2022/10/8 - 23:31
 */
public class IsSymmetric {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        int center = root.val;
        ArrayList<Integer> list = new ArrayList<>();
        inorderTravel(list,root,0);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }

        int l = 0,r = list.size() - 1;
        while (!(l == r && l == center)){
            if(list.get(l).equals(list.get(r))){
                l++;
                r--;
                if(l > r) return false;
            }else return false;
        }
        return true;
    }

    public void inorderTravel(ArrayList<Integer> list, TreeNode root,int sign) {
        if (root == null) return;
        inorderTravel(list,root.left,-101);
        list.add(root.val);
        inorderTravel(list,root.right,101);
    }

}
