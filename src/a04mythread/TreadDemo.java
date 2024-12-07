package a04mythread;

import a04mythread.MyThread;

import java.util.HashMap;
import java.util.Map;

public class TreadDemo {



    /*
    *   常用简单方法:
    *   String getName()
    *   //细节:线程默认有名字的是Thread- +num
    *   void setName()
    *   //细节:
    *       1.如果说没有给线程设置名字那么线程会有默认的名字
    *       2.细节给线程设置名字，可以通过set和构造方法，通过构造方法要给子类写调用super父类的构造方法
    *   static Thread currentThread()
    *   //在mian方法里面获取当前线程是mian主线程
    *       这是jvm虚拟机管理的，虚拟机启动后即加载多个线程，main就是其中一条
    *       它的作用就是专门去调用main方法
    *
    *   static void sleep()
    *   1000ms=1s
    *
    *
    *
    * */
    public static void main(String[] args) {

        MyThread t1=new MyThread("坦克");
        MyThread t2=new MyThread("飞机");
        //细节:
        System.out.println(t1.getName());
        System.out.println(t2.getName());

        //开启线程
        t1.start();
        t2.start();

        //当前线程为主线程
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println(name);
    }
}
