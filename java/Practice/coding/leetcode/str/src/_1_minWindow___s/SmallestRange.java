package _1_minWindow___s;

import java.util.*;

/**
 * @author: cgr
 * @date: 2022/10/5 - 13:38
 */


/*  最小区间
*   思路：滑动窗口：
*   使用hash
* */

public class SmallestRange {
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList();
        for(int i = 5;i >=0;--i){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(i);
            lists.add(list);
        }

        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.print(integer);
            }
            System.out.println("---------");
        }

    }

    public int[] smallestRange(List<List<Integer>> nums){
        int size = nums.size();
        Map<Integer, List<Integer>> indices = new HashMap<Integer, List<Integer>>();
        int xMin = Integer.MAX_VALUE, xMax = Integer.MIN_VALUE;

        // 将每个数所出现的列表索引进行记录
        for (int i = 0; i < size; i++) {
            for (int x : nums.get(i)) {
                List<Integer> list = indices.getOrDefault(x, new ArrayList<Integer>());
                list.add(i);
                indices.put(x, list);
                // 记录列表中出现数字的 最大值 与 最小值
                xMin = Math.min(xMin, x);
                xMax = Math.max(xMax, x);
            }
        }


        int[] freq = new int[size];
        int inside = 0;
        int left = xMin, right = xMin - 1;
        int bestLeft = xMin, bestRight = xMax;

        while (right < xMax) {
            right++;
            if (indices.containsKey(right)) {
                for (int x : indices.get(right)) {
                    freq[x]++;
                    if (freq[x] == 1) {
                        inside++;
                    }
                }
                while (inside == size) {
                    if (right - left < bestRight - bestLeft) {
                        bestLeft = left;
                        bestRight = right;
                    }
                    if (indices.containsKey(left)) {
                        for (int x: indices.get(left)) {
                            freq[x]--;
                            if (freq[x] == 0) {
                                inside--;
                            }
                        }
                    }
                    left++;
                }
            }
        }

        return new int[]{bestLeft, bestRight};
    }
}
