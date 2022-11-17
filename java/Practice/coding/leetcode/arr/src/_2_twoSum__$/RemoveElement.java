package _2_twoSum__$;

/**
 * @author: cgr
 * @date: 2022/9/29 - 16:53
 */
public class RemoveElement {
    public static void main(String[] args) {
        double t = 1/2;
        System.out.println(t);
    }

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int l = 0,r = len - 1;
        while (l < r) {
            while (r>0 && nums[r]==val) r--;
            while (l<len && nums[l]!=val) l++;
            if(l>=r) break;
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
        }
        return l+1;
    }


    public boolean checkStraightLine(int[][] coordinates) {
        int len =coordinates.length;
        int[] start = coordinates[0];
        int[] temp = coordinates[1];
        double k = (double) (temp[1]-start[1])/(double) (temp[0]-start[0]);
        for (int i = 2; i < len; ++i) {
            temp = coordinates[i];
            double t = (double) (temp[1]-start[1])/(double) (temp[0]-start[0]);
            if (t!=k) return false;
        }
        return true;
    }
}
