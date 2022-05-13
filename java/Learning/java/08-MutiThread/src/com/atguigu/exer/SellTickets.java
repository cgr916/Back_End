package com.atguigu.exer;

/**
 * @author: cgr
 * @date: 2022/4/14 - 23:15
 */
public class SellTickets {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("窗口1:");
        window2.setName("窗口2:");
        window3.setName("窗口3:");

        window1.start();
        window2.start();
        window3.start();

    }

}
class Window extends Thread{
    private static int tickets = 100;

    @Override
    public void run() {
        while (true){
            if(tickets > 0){
                System.out.println(getName()+ " 剩余票数："+ tickets);
                tickets --;
            }else{
                break;
            }
        }

    }
}