package a06mythread;

public class Mythread2 extends Thread{
    //守护进程打印100次

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
