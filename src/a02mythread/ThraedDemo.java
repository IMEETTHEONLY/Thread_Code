package a02mythread;

public class ThraedDemo {
    /*
    *   1.写一个类实现Runnable接口的MyRun
    *   2.实现方法run
    *   3.实例化MyRun，作为线程的任务
    *   4.new一个线程对象(Thread)，参数是MyRun
    *   5.线程对象调用start开启线程
    * */
    public static void main(String[] args) {

        //先创建任务对象
        MyRun r=new MyRun();


        //在创建两个线程
        Thread t1=new Thread(r);
        Thread t2=new Thread(r);

        //给两个线程取名字
        t1.setName("线程1");
        t2.setName("线程2");

        //调用线程的start方法执行线程
        t1.start();
        t2.start();

    }
}
