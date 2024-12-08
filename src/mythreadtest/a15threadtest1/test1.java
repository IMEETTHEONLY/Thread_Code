package mythreadtest.a15threadtest1;

public class test1 {
    public static void main(String[] args) {
        /*
        *
        *   用多线程模拟卖票过程并打印剩余电影票的数量
        * */


        //创建线程任务
        MyRunnable r=new MyRunnable();

        //创建两个线程窗口
        Thread t1=new Thread(r,"窗口1");
        Thread t2=new Thread(r,"窗口2");

        //开启两个线程
        t1.start();
        t2.start();

    }
}
