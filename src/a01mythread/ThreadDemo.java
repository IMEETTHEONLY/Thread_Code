package a01mythread;

public class ThreadDemo {

    /*
    *   1.写一个子类继承Thread
    *   2.实现子类的run方法
    *   3.实例化子类对象
    *   4.调用对象的start方法开启线程
    * */
    public static void main(String[] args) {
        //创建线程子类,调用start方法开启线程(不能调用run方法)

        //开启两个线程,深刻理解并发执行
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        //给两个线程取名字,否则分不清楚两个线程
        t1.setName("线程1:");
        t2.setName("线程2:");

        t2.start();
        t1.start();

    }
}
