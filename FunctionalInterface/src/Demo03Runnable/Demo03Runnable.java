package Demo03Runnable;

public class Demo03Runnable {
    public static void main(String[] args) {
        startThread(()->{
            System.out.println(Thread.currentThread().getName() + "线程任务执行！");
        });
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "线程任务执行！");

            }
        });
    }

    public static void startThread(Runnable run) {
        new Thread(run).start();
    }
}
