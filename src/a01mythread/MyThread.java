package a01mythread;
//继承了Thread子类,那么就是一个线程
public class MyThread extends Thread{

    //run方法就是此线程要执行的代码

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"HelloWorld");
        }
    }
}
