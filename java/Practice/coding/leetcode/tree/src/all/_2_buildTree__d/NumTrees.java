package all._2_buildTree__d;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * @author: cgr
 * @date: 2022/9/19 - 22:26
 */

/*  不同二叉搜索树的个数
*   动态规划：对应有一个公式解决
*       G[n] ==>  G[0]=1,G[1]=1;
*                   G[2] = G[0]*G[1]+G[1]*G[0];2
*                   G[3] = G[0]*G[2]+G[1]*G[1]+G[2]*G[0];5
*                   G[4] = 5+2+2+5 = 14
* */

public class NumTrees {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(list.contains("le"));
        int[] ints = new int[0];
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offerLast(3);
        q.offerLast(4);
        for (Integer integer : q) {
            System.out.println(integer);
        }
        System.out.println(q.pollLast());
    }

    public int numTrees(int n) {

        int[] G = new int[n+1];
        G[0]=1;
        G[1]=1;
        for(int i =2;i<=n;++i){
            for(int j =1;j<=i;++j){
                G[i]+=G[j-1]*G[i-j];
            }
        }
        return G[n];
    }
}
