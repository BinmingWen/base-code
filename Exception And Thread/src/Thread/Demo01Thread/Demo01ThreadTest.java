package Thread.Demo01Thread;

public class Demo01ThreadTest {
    public static void main(String[] args) {
        //3.创建实现线程类的实例对象。
        MyThread mt = new MyThread();
        //4.调用start方法启动线程
        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main: " + i);
        }
    }
}
