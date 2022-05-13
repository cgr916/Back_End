package com.atguigu.proj.team.view;

import java.util.Scanner;

/**
 * @author: cgr
 * @date: 2022/5/3 - 20:16
 */
public class TeamManageMenu {
    public static void main(String[] args) {
        TeamManageMenu tm = new TeamManageMenu();
        tm.showMenu();
    }

    public void showMenu(){
        System.out.println("-------------------------------------开发团队调度软件--------------------------------------");
        System.out.println("ID" + "\t"  +
                            "姓名"   + "\t"  +
                            "年龄"   + "\t"  +
                            "工资"   + "\t"  +
                            "职位"   + "\t"  +
                            "状态"   + "\t"  +
                            "奖金"   + "\t"  +
                            "股票"   + "\t"  +
                            "领用设备"
        );
    }

    public void showChoice(){
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        System.out.println("选择为: "+choice);
    }
}
