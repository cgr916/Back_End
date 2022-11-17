package _3_zigzagConversion;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/14 - 13:30
 */
public class ZigzagConversion {
    public static void main(String[] args) {
        ZigzagConversion z = new ZigzagConversion();
//        String s = z.convert("PAYPALISHIRING", 4);
        String s1 = z.convert("A", 1);
//        System.out.println(s);
        System.out.println(s1);
    }

    public String convert(String s, int numRows) {
        List<List<Character>> chars = new ArrayList<>(numRows);
        int len = s.length();
        if(len<=numRows) return s;
        for(int i = 0;i<numRows;++i){
            chars.add(new ArrayList<>());
        }
        int j = 0,row = 0;
        while (row >= 0 && row < numRows) {
            if(row==0){
                for (;row<numRows-1;++row){
                    if(j<len){
                        chars.get(row).add(s.charAt(j));
                        j++;
                    }else{
                        row = numRows;
                        break;
                    }
                }
            }else{
                for (;row>0;--row){
                    if(j<len){
                        chars.get(row).add(s.charAt(j));
                        j++;
                    }else{
                        row = numRows;
                        break;
                    }
                }
            }

        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < numRows; ++i) {
            int size = chars.get(i).size();
            for (int k = 0;k<size;++k){
                buffer.append(chars.get(i).get(k));
            }
        }
        return buffer.toString();
    }

}
