package _2_basicCalculatorII__;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: cgr
 * @date: 2022/9/2 - 16:42
 */

// medium

/*  简易计算器  1+2*3-4/5+6-7  ==>> 0
*  思路： Character.isDigit()
*   遇到 +- 将其与对应的数字放入栈中；
*   遇到 /* 将栈顶元素与其现有元素进行运算；
*   最后一个数字也进行相应入栈操作
*   最后执行相加
 */


public class CalculatorII {
    public static void main(String[] args) {
        CalculatorII calculator = new CalculatorII();
        int i = calculator.calculate("-3+2+1+10");
        System.out.println(i);
    }

    public int calculate(String s) {
        char sign;
        int num = 0;
        if (s.charAt(0) == '-') sign = '-';
        else sign = '+';
        Deque<Integer> stack = new LinkedList<Integer>();
        for(int i = 0;i<s.length();++i){
            if(Character.isDigit(s.charAt(i))){
                num = 10*num + s.charAt(i) -'0';
                System.out.println(num);
            }
            if(!Character.isDigit(s.charAt(i))&&s.charAt(i)!=' ' || i==s.length()-1){
                switch (sign){
                    case '+':
                        stack.push(num);
                        break;
                    case '-':
                        stack.push(-num);
                        break;
                    case '*':
                        num =  stack.pop()*num;
                        stack.push(num);
                        break;
                    case '/':
                        num = stack.pop()/num;
                        stack.push(num);
                        break;
                }
                sign = s.charAt(i);
                num = 0;
            }
        }
        while(!stack.isEmpty()){
            num+=stack.pop();
        }
        return num;
    }
}
