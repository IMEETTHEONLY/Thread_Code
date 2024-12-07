package a08threadsafe2;

public class MyRunnable implements Runnable{
    //线程公共访问变量,由于采用这种方式的线程只能最多只能一个访问(task)故不需要static
    int ticket=0;

    @Override
    public void run() {
        //写线程方法四步骤

        //1.写循环
        //2.同步代码块
        //判断共享数据是否到了末尾，如果到了末尾
        //判断共享数据是否到了末尾，如果没到末尾

        while (true){
            //在买票前先让线程抢占cpu，实现多窗口卖票
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

                //同步代码块
                if (method()) break;

        }
    }
    //非静态方法：锁是this
    private synchronized boolean method() {
        if (ticket == 100) {
            return true;
        } else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "正在卖" + ticket + "张票!!!!");
        }
        return false;
    }
}
