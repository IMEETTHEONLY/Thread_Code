package a06mythread;

public class Mythread1 extends Thread{

    @Override
    public void run() {
        //非守护进程打印10次
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
