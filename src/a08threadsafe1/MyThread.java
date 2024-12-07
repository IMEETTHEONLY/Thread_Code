package a08threadsafe1;

public class MyThread extends Thread{
    //这个线程专门用来处理买票的逻辑

    //票是静态变量只会初始化一次]
     static int ticket=0;

    //用作锁的对象是任意对象，但是一定要唯一  一般写当前类的字节码文件
//     static Object obj=new Object();

    @Override
    public void run() {
        //在这里执行买票的代码
        while (true){

            //让线程sleep  sleep的时候其他线程就可以去抢占cpu资源了，但是如果说在锁里面sleep，其他线程就无法抢占了
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            //每个窗口执行买票执行加上锁,操作系统会有算法让线程去抢占cpu，所以说会有执行的随机性
            synchronized (MyThread.class){
                if(ticket<100){
                    ticket++;
                    System.out.println(getName()+"正在卖出第:"+ticket+"票");

                }
                else {
                    break;
                }


            }
        }
    }
}
