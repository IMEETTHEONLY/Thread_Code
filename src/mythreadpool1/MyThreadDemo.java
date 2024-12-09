package mythreadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThreadDemo {

    /*
        线程池:存放线程的容器

    public static ExecutorService newCachedThreadPool()  创建一个没有上限的线程池
    *
    public static ExecutorService newFixedThreadPool  创建有上线的线程池
    * */



    public static void main(String[] args) throws InterruptedException {
        //无限空间的线程池
        ExecutorService pool1 = Executors.newCachedThreadPool();

//        //验证pool1是否可以根据任务个数创建线程
//        //提交五个任务
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//        pool1.submit(new MyRunnable());
//        //这里的结果就是创建了五个线程（打印结果有线程5）  这里的myrunnbale是100次循环，这样才让线程让不出来
//
//
//        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);
//        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);
//        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);
//        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);
//        pool1.submit(new MyRunnable());
//        Thread.sleep(1000);    //每次打印了让线程休息，这样线程就会归还线程，因为使用完了


        //有上限的线程池
        ExecutorService pool2 = Executors.newFixedThreadPool(3);
       //验证提交五个任务但是只有三个线程
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());
        pool2.submit(new MyRunnable());


    }
}
