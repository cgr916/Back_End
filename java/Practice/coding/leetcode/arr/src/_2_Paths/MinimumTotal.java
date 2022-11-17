package _2_Paths;

import java.util.List;

/**
 * @author: cgr
 * @date: 2022/10/2 - 21:11
 */

/*  三角形矩阵从最顶层到最底层的最小路径和
*
*
* */
public class MinimumTotal {
    public static void main(String[] args) {

    }


    public int minimumTotal(List<List<Integer>> triangle) {
        int size = triangle.size();
        int temp = 0;
        for (int i = 1; i < size; ++i) {
            for (int j = 0; j < i + 1; ++j) {
                if(j == 0){
                    temp = triangle.get(i).get(0) + triangle.get(i-1).get(0);
                    triangle.get(i).set(j,temp);
                }else if(j==i){
                    temp = triangle.get(i).get(i) + triangle.get(i-1).get(i-1);
                    triangle.get(i).set(j,temp);
                }
                else {
                    temp = Math.min(triangle.get(i).get(j) + triangle.get(i-1).get(j),
                            triangle.get(i).get(j) + triangle.get(i-1).get(j-1));
                    triangle.get(i).set(j,temp);
                }
            }
        }
        int minPathSum = triangle.get(size - 1).get(0);
        for (Integer num : triangle.get(size - 1)) {
            minPathSum = Math.min(minPathSum,num);
        }

        return minPathSum;
    }
}
