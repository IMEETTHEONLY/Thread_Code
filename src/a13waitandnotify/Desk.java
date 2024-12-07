package a13waitandnotify;

public class Desk {

    /*控制生产者和消费者的执行*/

    //桌子上是否有食物
    public static int flag=0;
    //锁变量
    public static Object lock=new Object();
    //消费者一个能吃多少碗，控制线程结束
    public static int count=10;

}
