package mythreadtest.a15threadtest2;

public class Test2 {
    /*
    *
    * 模拟两个人同时送礼物，当礼物少于10的时候就不在送出
    *
    * */
    public static void main(String[] args) {
        Mythread t1=new Mythread();
        Mythread t2=new Mythread();

        t1.setName("小明");
        t2.setName("小红");



        //开启线程

        t1.start();
        t2.start();


    }
}
