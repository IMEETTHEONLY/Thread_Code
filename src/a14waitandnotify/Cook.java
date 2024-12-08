package a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue queue;

    public Cook(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    //写同步代码块的四个步骤

    @Override
    public void run() {
      while (true){
          //不断的往阻塞队列当中放面条即可(因为阻塞队列自己加了锁
          try {
              queue.put("面条");
              System.out.println("厨师放了一碗面条");
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }


      }


    }
}
