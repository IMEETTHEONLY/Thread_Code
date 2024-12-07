package a02mythread;
//这个Runnable相当于是专门用来指定线程的任务的,实现任务代理
public class MyRun implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //调用当前线程的getname方法获取线程名字
            System.out.println(Thread.currentThread().getName()+"hello world!");
        }
    }
}
