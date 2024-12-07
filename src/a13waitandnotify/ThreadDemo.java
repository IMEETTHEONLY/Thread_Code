package a13waitandnotify;

public class ThreadDemo {


    public static void main(String[] args) {
        //创建生产者和消费者两个线程
        Cook t1=new Cook();
        foodie t2=new foodie();


        //为线程设置名字
        t1.setName("厨师");
        t2.setName("食客");

        //开启线程即可
        t1.start();
        t2.start();
    }

}
