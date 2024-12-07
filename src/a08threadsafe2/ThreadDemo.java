package a08threadsafe2;

public class ThreadDemo {
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
