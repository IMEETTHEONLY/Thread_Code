package a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class ThreadDemo {

    //阻塞队列实现等待唤醒机制，一个集合当中可以放多个被访问的数据
    public static void main(String[] args) {

        //创建阻塞队列
        ArrayBlockingQueue queue=new ArrayBlockingQueue(1);   //参数是队列的长度

        //创建两个线程并启动即可
        Cook c=new Cook(queue);
        Foodie f=new Foodie(queue);

        //开启线程
        c.start();
        f.start();


    }
}
