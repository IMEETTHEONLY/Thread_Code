package a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

    ArrayBlockingQueue queue;

    public Foodie(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                 queue.take();
                System.out.println("吃面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
