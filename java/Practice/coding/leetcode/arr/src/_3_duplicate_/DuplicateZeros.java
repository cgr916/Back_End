package _3_duplicate_;

/**
 * @author: cgr
 * @date: 2022/9/3 - 15:15
 */
public class DuplicateZeros {
    public static void main(String[] args) {


    }

    public void duplicateZeros(int[] arr) {
        int len = arr.length,i=0;
        int[] newArr = new int[len];
        for (int num:arr){
            if(i>=len) break;
            if(num != 0) newArr[i++] = num;
            else {
                newArr[i++] = num;
                newArr[i++] = 0;
            }
        }
        for(i=0;i<len;++i){
            arr[i] = newArr[i];
        }
    }
}
