package mythreadtest.a15threadtest5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread{

    //声明一个集合来接受全局数据
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //四步骤去写同步代码块
        while (true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (MyThread.class){
                if(list.isEmpty()){
                    break;
                }
                else {
                    //随机抽取奖池里面的奖项
                    Collections.shuffle(list);
                    //获取随机到的值
                    Integer remove = list.remove(0);
                    System.out.println(getName()+"抽取到了"+remove+"元");
                }

            }

        }
    }
}
