package mythreadtest.a15threadtest7;



import mythreadtest.a15threadtest6.MyThread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test6 {

    /*
    *   一个抽奖池,里面有许多奖项，两个抽奖箱从抽奖池当中抽取
    *
    *
    * */

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //定义数据，然后开启线程传递给线程即可
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,500,600,800,400,300,200);

        //先将任务给创建出来
        MyCallable mc=new MyCallable(list);

        //创建两个任务管理器分别管理两个返回值
        FutureTask<Integer> f1=new FutureTask<>(mc);
        FutureTask<Integer> f2=new FutureTask<>(mc);

        //再创建两个线程，将任务加载进去
        Thread t1=new Thread(f1);
        Thread t2=new Thread(f2);


        t1.setName("小青");
        t2.setName("小莉");

        //开启线程
        t1.start();
        t2.start();

        //三目找大值
        if(f1.get()>f2.get()){
            System.out.print("小青产生最大奖项:");
        }else {
            System.out.print("小莉产生最大奖项:");
        }
        System.out.println(f1.get()>f2.get()?f1.get():f2.get());

    }
}
