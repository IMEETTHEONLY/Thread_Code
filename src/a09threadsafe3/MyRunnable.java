package a09threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable implements Runnable{

    //线程公共访问变量,由于采用这种方式的线程只能最多只能一个访问(task)故不需要static
    int ticket=0;
    //创建锁对象，任务只有一个
    Lock lock=new ReentrantLock();
    @Override
    public void run() {//窗口 1 //窗口 2 //窗口 3
        //写线程方法四步骤

        //1.写循环
        //2.同步代码块
        //判断共享数据是否到了末尾，如果到了末尾
        //判断共享数据是否到了末尾，如果没到末尾

        while (true){
            //在买票前先让线程抢占cpu，实现多窗口卖票
            try {
                Thread.sleep(100);
                //卖票这里要被锁住
                lock.lock();
                if (ticket == 100) {
                    break;
                } else {
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticket + "张票!!!!");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                //无论此次执行到这里没有都要释放锁，这样cpu资源才会让出来，也不会导致执行完了未释放，其他线程一值都是就绪态
                lock.unlock();
            }


        }
    }

}
