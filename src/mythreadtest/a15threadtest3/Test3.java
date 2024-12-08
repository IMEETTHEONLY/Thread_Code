package mythreadtest.a15threadtest3;



public class Test3 {
    /*
    *   同时开启两个线程，共同获取1-100之间数字   输出奇数
    * */
    public static void main(String[] args) {

      MyThread t1=new MyThread();
      MyThread t2=new MyThread();

      t1.setName("线程1");
      t2.setName("线程2");

      t1.start();
      t2.start();
    }
}
