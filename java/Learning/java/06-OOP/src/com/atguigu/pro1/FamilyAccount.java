package com.atguigu.pro1;

/**
 * @author: cgr
 * @date: 2022/4/5 - 23:22
 */
public class FamilyAccount {
    public static void main(String[] args) {
        FamilyAccount fa = new FamilyAccount();
        fa.show();
    }
    private boolean flag;
    private int money;
    private int balance;
    private String desc;

    private void selectionMenu(){
        System.out.println("------------家庭收支记账软件-------------");
        System.out.println("-------------- 1:收支明细 --------------");
        System.out.println("-------------- 2:登记收入 --------------");
        System.out.println("-------------- 3:登记支出 --------------");
        System.out.println("-------------- 4:退出软件 --------------");
    }

    public void show(){
        boolean flag = true;
        while (flag){
            selectionMenu();
            System.out.println("请输入 1-4 中的任意一个数字:");
            switch (Utilities.readMenuSelection()){
                case '1'://明细
                    Utilities.clean(7);
                    System.out.println("---------------收支明细----------------");
                    System.out.println("收入/支出\t操作金额\t\t账户余额\t\t收支说明\n");
                    System.out.println("点击任意字符键返回");
                    if(Utilities.readString().length() > 1){
                        Utilities.clean(5);
                    }
                    break;
                case '2'://收入
                    System.out.println('2');
                    break;
                case '3'://支出
                    System.out.println('3');
                    break;
                case '4'://退出
                   flag = false;
                    System.out.println("即将退出");
                   break;
            }
        }
    }
}
