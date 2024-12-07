package a13waitandnotify;

public class Cook extends Thread{
//写同步代码块的四个步骤

    //1.写循环
    //2.写同步代码块
    //3.判断循环是否到了末尾。如果说到了
    //4.判断循环是否到了末尾。如果说未到
    @Override
    public void run() {
       while (true){
           synchronized (Desk.lock){
               if(Desk.count==0){
                   break;
               }
               else{
                   //如果说桌子上有食物就等待
                   if(Desk.flag==1){
                       try {
                           Desk.lock.wait();  //这里等待，消费者那边就可以唤醒
                       } catch (InterruptedException e) {
                           throw new RuntimeException(e);
                       }
                   }

                   else{
                       //没有食物就制作
                       System.out.println("厨师做了一碗面条");
                       //将状态变量改为1
                       Desk.flag=1;
                       //唤醒消费者
                       Desk.lock.notifyAll();
                   }
               }
           }

       }
    }
}
