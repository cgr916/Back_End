package com.atguigu.pro1;

import org.junit.Test;

/**
 * @author: cgr
 * @date: 2022/4/5 - 23:10
 */
public class ScanTest {
    public static void main(String[] args) {
        ScanTest st = new ScanTest();
        st.pro1Test();
    }
    public void pro1Test(){
        System.out.println("Enter:");
        while(true){
            char str1 = Utilities.readMenuSelection();
            if(str1 == '1'){
                System.out.println(str1);
                System.out.println("hahhaha");
            }else{
                Utilities.clean(1);
            }
        }
    }
}
