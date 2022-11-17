package _2_simplifyPath;

/**
 * @author: cgr
 * @date: 2022/9/15 - 20:13
 */



/*  比较版本号   1.0.0  1.0 ==>>>>  0
*   要点：不论是否含前导零，所得的数值总是这么多
*
* */

public class CompareVersion {
    public static void main(String[] args) {
        System.out.println();
    }

    public int compareVersion(String version1, String version2) {
        String[] s1 = version1.split(".");
        String[] s2 = version2.split(".");
        int len1 = s1.length, len2 = s2.length;
        int i = 0, j = 0;
        while (i<len1 || j<len2){
            if(i>=len1){
                if(getInt(s2[j])!=0) return -1;
                // j++
            }else if(j>=len2){
                if(getInt(s1[i])!=0) return 1;
                // i++
            }else {
                if(getInt(s1[i])>getInt((s2[j]))) return 1;
                else if(getInt(s1[i])<getInt((s2[j]))) return -1;
                else {
                    i++;
                    j++;
                }
            }
        }
        return 0;
    }

    public int getInt(String s){
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum=sum*10+(c-'0');
        }
        return sum;
    }

}
