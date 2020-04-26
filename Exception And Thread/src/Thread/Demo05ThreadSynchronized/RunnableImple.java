package Thread.Demo05ThreadSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImple implements Runnable {

    //100张票在售卖
    static int ticket = 100;

    @Override
    public void run() {

        while (ticket > 0) {
            //同步代码块
            payTicket02();
        }
    }

    //使用同步方法 锁对象为this
    /*public *//*synchronized*//* void payTicket() {
        synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->" + "正在售卖" + ticket + "张票");
                ticket--;
            }
        }
    }*/
    //静态锁对象为本类的class属性
    public static synchronized void payTicket02() {

        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + "正在售卖" + ticket + "张票");
            ticket--;
        }

    }
}
