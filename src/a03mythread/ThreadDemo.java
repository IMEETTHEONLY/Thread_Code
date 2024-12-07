package a03mythread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadDemo {
    /*
    *   特点:可以获取到多线程运行到的结果
    *
    *   实现方法:
    *   1.创建一个MyCallable实现Callable
    *   2.重写call方法(有返回值)
    *   3.创建MyCallable对象
    *   4.创建FutureTask对象，用来接管返回值的数据
    *   5.创建Thread类开启线程即可
    *
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //表示多线程要执行的任务
        MyCallable mc=new MyCallable();
        //接收任务的返回值对象
        FutureTask<Integer> ft=new FutureTask<>(mc);
        //创建线程开启线程
        Thread t=new Thread(ft);
        //执行线程
        t.start();

        //获取返回值
        Integer i = ft.get();
        System.out.println(i);
    }
}
