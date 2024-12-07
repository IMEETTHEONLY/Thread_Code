package a07mythread;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        /*
        *
        *       public final void join()  插入线程/插队线程
        * */

        //开启一个新的线程
        MyThread  t1=new MyThread();
        t1.setName("土豆");
        t1.run();


        t1.join();//插入t1线程到当前线程之前，t1执行之后再执行当前线程

        //当前main线程下执行一段程序
        for (int i = 0; i < 10; i++) {
            System.out.println("main"+i);
        }

    }
}
