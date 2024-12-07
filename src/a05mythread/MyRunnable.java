package a05mythread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        //打印某个线程的值
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"hello world");
        }
    }
}
