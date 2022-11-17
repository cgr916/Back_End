package all._3_deleteNode_$;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author: cgr
 * @date: 2022/10/3 - 16:21
 */

/*  删除链表中和为0的连续节点序列
*   结合数组之前的题目：和为k的子数组
*   方法：可通过构建hashmap，由于 pre-0=pre，因此只要前缀和为之前出现过的就进行覆盖;
*
* */

public class RemoveZeroSumSublists_$ {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.remove(2);
//        for (Integer n : integers) {
//            System.out.println(n);
//        }
        System.out.println(integers.get(2));
    }

    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, ListNode> hm = new HashMap<>();
        return null;
    }
}
