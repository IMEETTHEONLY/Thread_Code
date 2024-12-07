package a08threadsafe1;



public class ThreadDemo {
    /*
    *       实现三个窗口同时卖100张票
    * */
    public static void main(String[] args) {


        //创建三个线程分别表示窗口
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();

        //设置名字
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        //开启三个窗口线程
        t1.start();
        t2.start();
        t3.start();

    }
}
