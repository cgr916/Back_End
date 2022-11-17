package _3_romanToIntege_;

/**
 * @author: cgr
 * @date: 2022/9/2 - 15:20
 */

/*  罗马数字转换   IV  VI  XI  ===>>> 4,5,11
*   思路：V,X等可以存在I,V放在前后的情况
*
* */
public class RomanToInt {
    public static void main(String[] args) {

    }

    public int romanToInt(String s){
        int i = 0,count=0;
        while(i<s.length()){
            if(s.charAt(i)=='I'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='V'||s.charAt(i+1)=='X'){
                        count-=1;
                    }
                }else count+=1;
            }else if(s.charAt(i)=='V'){
                count+=5;
            }else if(s.charAt(i)=='X'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='L'||s.charAt(i+1)=='C') count-=10;
                }else count+=10;
            }else if(s.charAt(i)=='L'){
                count+=50;
            }else if(s.charAt(i)=='C'){
                if(i<s.length()-1){
                    if(s.charAt(i+1)=='D'||s.charAt(i+1)=='M') count-=100;
                }else count+=100;
            }else if(s.charAt(i)=='D'){
                count+=500;
            }else{
                count+=1000;
            }
            i++;
        }
        return count;
    }
}
