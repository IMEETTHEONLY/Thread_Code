package mythreadtest.a15threadtest4;

public class Test4 {
    /*
    *
    *   五个人抢100元,分为3个红包
    *   打印枪到红包金额的人和抢到的金额
    *
    * */
    public static void main(String[] args) {


        //开启五个线程
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        MyThread t4=new MyThread();
        MyThread t5=new MyThread();

        //取名字
        t1.setName("A");
        t2.setName("B");
        t3.setName("C");
        t4.setName("D");
        t5.setName("E");

        //开启线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

}
