package Thread.DeadLock;

public class DeadLock implements Runnable {
    A a = new A();
    B b = new B();
    public void init(){
        Thread.currentThread().setName("主线程");
        a.foo(b);
        System.out.println("进入主线程后");
    }
    @Override
    public void run() {
        Thread.currentThread().setName("副线程");
        b.bar(a);
        System.out.println("进入副线程之后");
    }

    public static void main(String[] args) {
        DeadLock dl = new DeadLock();
        new Thread(dl).start();
        dl.init();
    }
}
