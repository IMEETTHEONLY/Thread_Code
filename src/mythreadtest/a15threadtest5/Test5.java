package mythreadtest.a15threadtest5;

import java.util.ArrayList;
import java.util.Collections;

public class Test5 {

    /*
    *   一个抽奖池,里面有许多奖项，两个抽奖箱从抽奖池当中抽取
    *
    *
    * */

    public static void main(String[] args) {

        //定义数据，然后开启线程传递给线程即可
        ArrayList<Integer> list=new ArrayList<>();
        Collections.addAll(list,500,600,800,400,300,200);

        //开启两个线程即可
        MyThread t1=new MyThread(list);
        MyThread t2=new MyThread(list);

        t1.setName("小青");
        t2.setName("小莉");

        //开启线程
        t1.start();
        t2.start();

    }
}
