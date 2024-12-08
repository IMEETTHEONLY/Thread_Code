package mythreadtest.a15threadtest4;

import java.util.Random;

public class MyThread extends Thread{

    //红包总额
     static double moeny=100;

    //红包个数
     static int count=3;

    //红包最小金额
    static final double MIN=0.01;

    @Override
    public void run() {
        //写同步代码块的四步骤
        //由于每个人只能抢一次红包故不用循环，所以说执行完了一次该线程就不会再去抢夺cpu资源，因为它自己线程已经结束
        synchronized (MyThread.class){
            if(count==0){
                System.out.println(getName()+"没有抢到红包!!!");
            }
            else {
                double prize=0;  //抢到的金额

                //如果说ocunt=1的化，就把剩余的金额全部给这个人
                if(count==1){
                    prize=moeny;
                    System.out.println(getName()+"抢到的金额为"+prize);
                    count--;
                }

                else{
                    //如果说是前两次，就要随机金额

                    Random r=new Random();

                    //但是随机数据的取值范围要收min的影响
                    double min=moeny-(count-1)*MIN;
                    //获取随机范围
                    double bound=r.nextDouble(min);

                    //如果说随机到0，还要变为0.01
                    if(bound==0){
                        bound=MIN;
                    }

                    //打印这个人抽取的红包即可
                    System.out.println(getName()+"抽取到的金额为"+bound);
                    //count--
                    count--;
                    //金额变化为抽取后的金额
                    moeny=moeny-bound;

                }

            }




        }




    }
}
