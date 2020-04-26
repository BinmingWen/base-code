package Thread.Demo01Thread;

//1.继承Thread类
public class MyThread extends Thread {
    @Override
    //2.实现run方法
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("run: "+i);
        }
    }
}
