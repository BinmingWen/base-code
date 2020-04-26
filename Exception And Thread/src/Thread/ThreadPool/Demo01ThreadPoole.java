package Thread.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPoole {
    public static void main(String[] args) {
        //1.使用线程池的工厂类Executors提供静态方法newFixedThreadPool产生一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        //创建一个实现Runnable接口，并重写run方法，设置线程任务，submit开启线程，执行run方法
        es.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("创建线程并执行！"+Thread.currentThread().getName());
            }
        });
        //
        es.shutdown();
    }
}
