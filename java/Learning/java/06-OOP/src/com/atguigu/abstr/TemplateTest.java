package com.atguigu.abstr;

/**
 * @author: cgr
 * @date: 2022/4/2 - 15:15
 */
public class TemplateTest {
    public static void main(String[] args) {
        Template test = new TemplateExtend();
        test.timeCost();
//        test.code();
    }
}

abstract class Template{
    public void timeCost(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费时间为: "+(end-start));
    }
    public abstract void code();
}
class TemplateExtend extends Template{
    @Override
    public void code(){
        boolean isFlag;
        for (int i = 2; i < 100; i++) {
             isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFlag = false;
                    break;
                }
            }
            if(isFlag)
            System.out.println(i);
        }
    }
}