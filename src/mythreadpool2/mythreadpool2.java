package mythreadpool2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class mythreadpool2 {

    /*      ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor
    *       参数一:核心线程数  它是随着线程池销毁才会销毁的线程
    *       参数二:最大线程数   核心+临时线程的和
    *       参数三:空闲线程最大存活时间
    *       参数四:时间单位  用TimeUtil指定
    *       参数五:任务队列
    *       参数六:创建线程工厂
    *       参数七:任务拒绝策略
    *
    *
    * */

    public static void main(String[] args) {
        //创建自定义线程池的实例
        ThreadPoolExecutor  threadPoolExecutor=new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(6),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()   //这是一个内部类所以说要用外部类.
        );







    }
}
