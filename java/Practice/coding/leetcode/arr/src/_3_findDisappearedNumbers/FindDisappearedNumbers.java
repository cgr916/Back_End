package _3_findDisappearedNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/3 - 13:51
 */
public class FindDisappearedNumbers {
    public static void main(String[] args) {
        FindDisappearedNumbers findDisappearedNumbers = new FindDisappearedNumbers();
        for (Integer number : findDisappearedNumbers.findDisappearedNumbers(new int[]{2, 2})) {
            System.out.println(number);
        }

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>(nums.length);
        for (int i = 0;i<nums.length;++i) {
            list.add(i+1);
        }
        int i = 0,j=0;
        while (i<nums.length && j<list.size()){
            if(nums[i]==list.get(j)){
                list.remove(j);
                i++;
            }else if(nums[i]<list.get(j)) i++;
            else j++;
        }
        return list;
    }
}
