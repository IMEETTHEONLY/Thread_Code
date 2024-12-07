package a13waitandnotify;

public class foodie extends Thread{

    //写同步代码块的四个步骤

    //1.写循环
    //2.写同步代码块
    //3.判断循环是否到了末尾。如果说到了
    //4.判断循环是否到了末尾。如果说未到
    @Override
    public void run() {
        while (true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }
                else {
                    //先判断桌子上是否有食物
                    if(Desk.flag==0){
                        //如果说没有就等待
                        try {
                            Desk.lock.wait();  //要用当前锁去绑定这样才能唤醒
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    //如果说桌子上面有食物
                    else {
                        //那就吃掉

                        //将状态变量的状态修改
                        Desk.flag=0;
                        //将能吃的数量先减少
                        Desk.count--;
                        //打印还能吃几碗
                        System.out.println("还能吃"+Desk.count+"碗");
                        //唤醒厨师继续做
                        Desk.lock.notifyAll();
                    }



                }


            }

        }
    }
}
