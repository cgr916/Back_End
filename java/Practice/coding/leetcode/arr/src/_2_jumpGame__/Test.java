package _2_jumpGame__;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: cgr
 * @date: 2022/9/4 - 9:55
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        char[] ch = {'t', 'e', 's', 't'};
        int i =1;
        String str1 = "hello";
        String str2 = "hel" + "lo";
        System.out.println(str1==str2);
    }

    public int id = 1001;
    public String name;

    public void change(String s){
        s = "2:hello";
    }

    public void sum(int i){
        i++;
    }

    public List list;
    {
        name = "hello-1";
        System.out.println(1);
    }

    public Test() {
        this.name = "hello";
        this.list = new ArrayList();
        System.out.println(2);
    }


    {
        name = "hello-2";
        System.out.println(3);
    }
}
