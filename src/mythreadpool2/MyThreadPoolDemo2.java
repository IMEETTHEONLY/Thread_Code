package mythreadpool2;

public class MyThreadPoolDemo2 {
    //向java虚拟机返回可用的处理器数目
    public static void main(String[] args) {
        int count=Runtime.getRuntime().availableProcessors();
        System.out.println(count);

    }
}
