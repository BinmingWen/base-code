package Thread.Demo02ThreadMethod;

public class ThreadMethodTest {
    public static void main(String[] args) {
       /* MyThread mt = new MyThread();
        mt.start();
        mt.run();*/
       new MyThread().start();
       new MyThread().start();
        System.out.println(Thread.currentThread().getName());
    }
}
