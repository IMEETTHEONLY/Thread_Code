package a06mythread;

public class ThreadDemo {
    /*
    *   final void setDaemon(boolean on)  设置为守护线程
    *   守护线程:
    *       当非守护线程结束的时候，守护线程也会跟陆续随着结束(他会通知守护进程，但是在通知过程中，守护进程还会执行一会儿)
    *
    *
    * */
    public static void main(String[] args) {
        //实例化两个线程
        Mythread1 m1=new Mythread1();
        Mythread2 m2=new Mythread2();

        //给两个线程设置名字
        m1.setName("女神");
        m2.setName("备胎");

        //开启守护进程
        m2.setDaemon(true);

        m1.start();
        m2.start();
    }
}
