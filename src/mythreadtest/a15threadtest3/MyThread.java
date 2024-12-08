package mythreadtest.a15threadtest3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    public static int number=100;

    public static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            //先让获得cpu的进行休眠，以模拟竞争
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //同步代码块
            try {
                lock.lock();
                if(number%2==0){
                    number--;
                    continue;
                }
                if(number>=0) {
                    System.out.println(getName()+"打印"+number);
                    number--;
                }
                if(number<0){
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                //解开锁
                lock.unlock();
            }
        }

    }
}
