package mythreadtest.a15threadtest7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class MyCallable implements Callable<Integer> {

    //声明一个集合来接受全局数据
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }





    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList=new ArrayList<>();  //线程栈里面的集合，私有集合
        //四步骤去写同步代码块
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (MyCallable.class){
                if(list.isEmpty()){
                    //结束时，处理和打印数据即可
                    System.out.println(Thread.currentThread().getName()+boxList);
                        break;
                    }

                else {
                    //随机抽取奖池里面的奖项
                    Collections.shuffle(list);
                    //获取随机到的值
                    Integer remove = list.remove(0);
                    //加入线程集合即可
                    boxList.add(remove);


                }

            }

        }
        if(boxList.isEmpty()){
            return null;
        }else {
            return Collections.max(boxList);
        }
    }
}
