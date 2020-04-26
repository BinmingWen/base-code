package Thread.Demo02ThreadMethod;

public class MyThreadName extends Thread {
    public MyThreadName(){}

    public MyThreadName(String s) {
        super(s);
    }

    @Override
    public void run() {
        //获取线程的名字
        System.out.println(Thread.currentThread().getName());
    }
}
