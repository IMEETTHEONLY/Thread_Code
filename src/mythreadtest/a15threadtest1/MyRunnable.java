package mythreadtest.a15threadtest1;

public class MyRunnable implements Runnable{
    int ticket=1000;

    //这里实现同步代码块，进行卖票

    //同步代码块四步骤
    @Override
    public void run() {
       while (true){
           //让每次获取cpu线程在这里先睡3s,让线程争夺cpu
           try {
               Thread.sleep(3);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           synchronized (MyRunnable.class){
               if(ticket<0){
                   break;
               }
               else{
                   System.out.println(Thread.currentThread().getName()+"卖出"+"第"+(1000-ticket)+"张票"+"@还剩下"+ticket);
                   ticket--;
               }

           }


       }
    }
}
