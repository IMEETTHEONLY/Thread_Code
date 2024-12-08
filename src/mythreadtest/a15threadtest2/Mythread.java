package mythreadtest.a15threadtest2;

public class Mythread extends Thread{

    public static int gift=100;

    //这里实现同步代码块
    @Override
    public void run() {
        while (true){
            synchronized (Mythread.class){

                if(gift<=10){
                    System.out.println("礼品少于10份,不在送出");
                    break;
                }
                else{
                    gift--;
                    System.out.println(getName()+"正在送出礼物"+"还剩下"+gift+"个礼物");
                }
            }
        }
    }
}
