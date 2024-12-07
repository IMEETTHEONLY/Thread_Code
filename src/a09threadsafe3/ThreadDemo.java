package a09threadsafe3;

import a08threadsafe2.MyRunnable;

public class ThreadDemo {
    /*
    *   使用lock锁来自己加锁和取消锁
    * */

    public static void main(String[] args) {
        //创建线程任务
        Runnable r=new MyRunnable();

        //创建三个线程开启任务
        Thread r1=new Thread(r,"窗口1");
        Thread r2=new Thread(r,"窗口2");
        Thread r3=new Thread(r,"窗口3");

        //开启线程
        r1.start();
        r2.start();
        r3.start();
    }
}
