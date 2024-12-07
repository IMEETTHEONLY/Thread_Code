package a05mythread;

public class ThreadDemo {
    /*
    *   setPriority(int newPriority)  //设置线程的优先级
    *   //细节；有默认的优先级
    *   final int getPriority   //获取线程的优先级
    *   优先级高的只是抢占到CPU的概率更大了
    *
    * */
    public static void main(String[] args) {
        //创建要执行的任务
        MyRunnable m1=new MyRunnable();

        //新建Thread对象
        Thread t1=new Thread(m1,"飞机");
        Thread t2=new Thread(m1,"坦克");

        //打印优先级
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        //设置优先级  t1抢占cpu的概率比t2大，但是只是一个概率
        t1.setPriority(10);
        t2.setPriority(1);

        //开启线程
        t1.start();
        t2.start();

    }
}
