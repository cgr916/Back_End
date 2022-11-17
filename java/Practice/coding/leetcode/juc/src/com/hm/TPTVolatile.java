package com.hm;

/**
 * @author: cgr
 * @date: 2022/10/30 - 17:25
 */
public class TPTVolatile {
    public static void main(String[] args) throws Exception {
//        TPTVolatile t = new TPTVolatile();
//        t.start();
//
//        Thread.sleep(3500);
//        System.out.println("stop");
//        t.stop();
        for (int i = 0;i<3;++i){
            System.out.println(i+"begin");
            try {
                int[] ints = new int[2];
                System.out.println(ints[2]);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(i+"end");
        }

    }


    private Thread thread;
    private volatile boolean stop = false;

    public void start(){
        thread = new Thread(() -> {
            while(true) {
                //Thread current = Thread.currentThread();
                if(stop) {
                    System.out.println("料理后事");
                    break;
                }
                try {
                    Thread.sleep(1000);
                    System.out.println("将结果保存");
                } catch (InterruptedException e) {

                }
                // 执行监控操作
            }
        },"监控线程");
        thread.start();
    }

    public void stop() {
        stop = true;
        thread.interrupt();
    }
}
