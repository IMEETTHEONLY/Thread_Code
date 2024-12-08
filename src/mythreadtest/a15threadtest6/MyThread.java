package mythreadtest.a15threadtest6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MyThread extends Thread{

    //声明一个集合来接受全局数据
    ArrayList<Integer> list;

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    //创建两个静态集合来装载两个线程抽取到的数据
    static ArrayList<Integer> list1=new ArrayList<>();
    static ArrayList<Integer> list2=new ArrayList<>();

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
                    //结束时，处理和打印数据即可
                    if(getName().equals("小青")){
                        List<Integer> collect = list1.stream().sorted().collect(Collectors.toList());

                        int max=collect.get(collect.size()-1);
                        int sum=0;

                        for (Integer i : collect) {
                            sum+=i;
                        }

                        System.out.println(list1+"最高奖项为"+max+"总和为"+sum);

                    }

                    else{
                        List<Integer> collect = list2.stream().sorted().collect(Collectors.toList());
                        int max=collect.get(collect.size()-1);
                        int sum=0;

                        for (Integer i : collect) {
                            sum+=i;
                        }

                        System.out.println(list2+"最高奖项为"+max+"总和为"+sum);

                    }
                    break;
                }
                else {
                    //随机抽取奖池里面的奖项
                    Collections.shuffle(list);
                    //获取随机到的值
                    Integer remove = list.remove(0);
                    //比对当前线程该加入哪一个集合
                    if(getName().equals("小青")){
                        list1.add(remove);
                    }
                    else {
                        list2.add(remove);
                    }
                   // System.out.println(getName()+"抽取到了"+remove+"元");
                }

            }

        }
    }
}
